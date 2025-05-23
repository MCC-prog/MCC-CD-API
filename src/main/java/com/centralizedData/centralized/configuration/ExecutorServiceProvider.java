package com.centralizedData.centralized.configuration;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;


public class ExecutorServiceProvider {

	private static ExecutorServiceProvider INSTANCE;

	private ExecutorService executorService;

	private ExecutorServiceProvider() {
		executorService = new ThreadPoolExecutor(1, 200, 0L, TimeUnit.MILLISECONDS,
				new LinkedBlockingQueue<Runnable>());
	}

	public synchronized static ExecutorServiceProvider getInstance() {
		if (INSTANCE == null) {
			INSTANCE = new ExecutorServiceProvider();
		}
		return INSTANCE;
	}

	public ExecutorService getExecutorService() {
		return executorService;
	}

}
