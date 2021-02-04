package com.android.example.module06_module025_module2;

public class ClassAAG {
	private 	io.reactivex.subscribers.TestSubscriber<Object> instance_var_1_0 = new io.reactivex.subscribers.TestSubscriber();
	private 	io.reactivex.subscribers.TestSubscriber<Object> instance_var_1_1 = new io.reactivex.subscribers.TestSubscriber();
	private 	io.reactivex.subscribers.TestSubscriber<Object> instance_var_1_2 = new io.reactivex.subscribers.TestSubscriber();
	private 	io.reactivex.observers.TestObserver<Object> instance_var_1_3 = new io.reactivex.observers.TestObserver();
	private 	io.reactivex.subscribers.TestSubscriber<Object> instance_var_1_4 = new io.reactivex.subscribers.TestSubscriber();

	public void method0(
		io.reactivex.subscribers.TestSubscriber<Object> param0,
		io.reactivex.subscribers.TestSubscriber<Object> param1,
		io.reactivex.subscribers.TestSubscriber<Object> param2) throws Throwable {
		io.reactivex.subscribers.TestSubscriber<Object> local_var_2_3 = new io.reactivex.subscribers.TestSubscriber();
		local_var_2_3.isDisposed();

		io.reactivex.subscribers.TestSubscriber<Object> local_var_2_4 = new io.reactivex.subscribers.TestSubscriber();
		local_var_2_4.isDisposed();

		io.reactivex.disposables.SerialDisposable local_var_2_5 = new io.reactivex.disposables.SerialDisposable();
		local_var_2_5.isDisposed();

	}

	public void method1(
		io.reactivex.subscribers.TestSubscriber<Object> param0) throws Throwable {
		param0.isDisposed();

	}

	public void method2(
		io.reactivex.disposables.SerialDisposable param0,
		io.reactivex.subscribers.TestSubscriber<Object> param1) throws Throwable {
		param0.isDisposed();

		param0.get();

	}
}
