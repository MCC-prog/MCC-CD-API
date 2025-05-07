package com.centralizedData.centralized.utils;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.util.Iterator;
import java.util.Vector;

import javax.imageio.ImageIO;
import javax.imageio.ImageWriter;
import javax.imageio.stream.ImageOutputStream;
import javax.print.DocFlavor;
import javax.print.DocPrintJob;
import javax.print.PrintException;
import javax.print.PrintService;
import javax.print.SimpleDoc;
import javax.print.attribute.PrintJobAttributeSet;
import javax.print.attribute.PrintRequestAttributeSet;
import javax.print.attribute.standard.Chromaticity;
import javax.print.attribute.standard.ColorSupported;
import javax.print.attribute.standard.MediaPrintableArea;
import javax.print.attribute.standard.PrinterResolution;
import javax.print.event.PrintJobListener;
import javax.print.event.PrintServiceAttributeListener;
import javax.swing.JEditorPane;
import javax.swing.text.View;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class HtmlPrinter {

	@Value("${PRINTER_ENABLED}")
	private Boolean printEnabled;

	PrintService defaultService;

	public static int VIEW_X_AXIS = 800;
	public static int VIEW_Y_AXIS = 1200;
	public static int DEFAULT_DPI = 72;
	public static float DEFAULT_PAGE_WIDTH_INCH = 8.5f;
	public static float DEFAULT_PAGE_HEIGHT_INCH = 11f;

	Vector psalListeners = new Vector();
	Vector pjlListeners = new Vector();
	PrintRequestAttributeSet attributes;

	public  void printHtml(String htmltext) throws Exception {
		if(printEnabled){
			HtmlPrinter prn=new HtmlPrinter();
			JEditorPane pane= new JEditorPane();
			pane.setContentType("text/html");
			pane.setText(htmltext);
			if(prn.defaultService!=null)
				prn.printJEditorPane(pane, prn.defaultService);
		}

	}

	private boolean printJEditorPane( JEditorPane jep, PrintService ps ) throws Exception {
		if( ps == null || jep == null )
			return false;
		// get the root view of the preview pane
		View rv = jep.getUI().getRootView( jep );

		int x = VIEW_X_AXIS;
		int y = VIEW_Y_AXIS;

		// find out if the print has been set to colour mode
		DocPrintJob dpj = ps.createPrintJob();
		PrintJobAttributeSet pjas = dpj.getAttributes();
		// get the DPI and printable area of the page. use default values if not available
		// use this to get the maximum number of pixels on the vertical axis
		PrinterResolution pr = ( PrinterResolution ) pjas.get( PrinterResolution.class );
		int dpi;
		float pageX, pageY;
		if( pr != null )
			dpi = pr.getFeedResolution( PrinterResolution.DPI );
		else dpi = DEFAULT_DPI;

		MediaPrintableArea mpa = ( MediaPrintableArea ) pjas.get( MediaPrintableArea.class );
		if( mpa != null )
		{
			pageX = mpa.getX( MediaPrintableArea.INCH );
			pageY = mpa.getX( MediaPrintableArea.INCH );
		}
		else
		{
			pageX = DEFAULT_PAGE_WIDTH_INCH;
			pageY = DEFAULT_PAGE_HEIGHT_INCH;
		}
		int pixelsPerPageY = ( int ) ( dpi * pageY );	
		// make colour true if the user has selected colour,
		//and the PrintService can support colour
		boolean colour = pjas.containsValue( Chromaticity.COLOR );
		colour = colour & ( ps.getAttribute( ColorSupported.class ) == ColorSupported.SUPPORTED );
		// create a BufferedImage to draw on
		int imgMode;
		if( colour )
			imgMode = BufferedImage.TYPE_3BYTE_BGR;
		else
			imgMode = BufferedImage.TYPE_BYTE_GRAY;

		BufferedImage img = new BufferedImage( x, y, imgMode );
		Graphics myGraphics = img.getGraphics();
		myGraphics.setClip( 0, 0, x, y );
		myGraphics.setColor( Color.WHITE );
		myGraphics.fillRect( 0, 0, x, y );
		rv.paint( myGraphics, new Rectangle( 0, 0, x, y ) );
		try {
			// write the image as a JPEG to the ByteArray so it can be printed
			Iterator writers = ImageIO.getImageWritersByFormatName( "jpeg" );
			ImageWriter writer = ( ImageWriter ) writers.next();
			ByteArrayOutputStream out = new ByteArrayOutputStream();
			ImageOutputStream ios = ImageIO.createImageOutputStream( out );
			writer.setOutput( ios );
			// get the number of pages we need to print this image
			int imageHeight = img.getHeight();
			int numberOfPages = ( int ) ( ( imageHeight / pixelsPerPageY ) + 0.5 );
			// print each page
			for( int i = 0; i < numberOfPages; i++ )
			{
				int startY = i * pixelsPerPageY;
				// get a subimage which is exactly the size of one page
				BufferedImage subImg = img.getSubimage( 0, startY, x, pixelsPerPageY );
				writer.write( subImg );
				SimpleDoc sd = new SimpleDoc( out.toByteArray(), DocFlavor.BYTE_ARRAY.JPEG, null );
				printDocument( sd, ps );
				// reset the ByteArray so we can start the next page
				out.reset();
			}
		}
		catch(Exception e ){
			throw e;
		}
		return true;

	}

	private boolean printDocument(SimpleDoc doc, PrintService ps) throws PrintException {
		if( ps == null )
			return false;

		addAllPrintServiceAttributeListeners( ps );
		DocPrintJob dpj = ps.createPrintJob();
		addAllPrintJobListeners( dpj );
		dpj.print( doc, attributes );
		return true;
	}

	private void addAllPrintJobListeners(DocPrintJob dpj) {
		// add all listeners that are currently added to this object
		for( int i = 0; i < pjlListeners.size(); i++ ) {
			PrintJobListener p = ( PrintJobListener ) pjlListeners.get( i );
			dpj.addPrintJobListener( p ); } 		
	}

	private void addAllPrintServiceAttributeListeners(PrintService ps) {
		// add all listeners that are currently added to this object
		for( int i = 0; i < psalListeners.size(); i++ ) {
			PrintServiceAttributeListener p = ( PrintServiceAttributeListener ) psalListeners.get( i );
			ps.addPrintServiceAttributeListener( p );
		}   	
	}

}
