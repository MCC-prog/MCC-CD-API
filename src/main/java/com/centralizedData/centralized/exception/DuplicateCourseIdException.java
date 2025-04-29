package com.centralizedData.centralized.exception;

public class DuplicateCourseIdException extends Exception{

	public DuplicateCourseIdException(String message) {
		super(message);
	}
	/*
	 * public static void main(String[] args) {
	 * 
	 * try { throw new
	 * DuplicateCourseIdException("CourseId already present in the year"); }
	 * catch(DuplicateCourseIdException d) { System.out.println(d.getMessage()); } }
	 */
}
