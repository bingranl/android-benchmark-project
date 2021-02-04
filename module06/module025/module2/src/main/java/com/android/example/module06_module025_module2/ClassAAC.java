package com.android.example.module06_module025_module2;

public class ClassAAC {
	private 	io.reactivex.subscribers.TestSubscriber<Object> instance_var_1_0 = new io.reactivex.subscribers.TestSubscriber();
	private 	io.reactivex.subscribers.TestSubscriber<Object> instance_var_1_1 = new io.reactivex.subscribers.TestSubscriber();
	private 	io.reactivex.subscribers.TestSubscriber<Object> instance_var_1_2 = new io.reactivex.subscribers.TestSubscriber();

	public void method0(
		io.reactivex.subscribers.TestSubscriber<Object> param0,
		io.reactivex.subscribers.TestSubscriber<Object> param1,
		io.reactivex.subscribers.TestSubscriber<Object> param2) throws Throwable {
		io.reactivex.internal.disposables.ListCompositeDisposable local_var_2_3 = new io.reactivex.internal.disposables.ListCompositeDisposable();
		local_var_2_3.isDisposed();

	}

	public void method1(
		io.reactivex.internal.disposables.ListCompositeDisposable param0,
		io.reactivex.subscribers.TestSubscriber<Object> param1,
		io.reactivex.subscribers.TestSubscriber<Object> param2) throws Throwable {
		io.reactivex.subscribers.TestSubscriber<Object> local_var_2_3 = new io.reactivex.subscribers.TestSubscriber();
		local_var_2_3.isDisposed();

		io.reactivex.subscribers.TestSubscriber<Object> local_var_2_4 = new io.reactivex.subscribers.TestSubscriber();
		local_var_2_4.assertNotSubscribed();

		io.reactivex.subscribers.TestSubscriber<Object> local_var_2_5 = new io.reactivex.subscribers.TestSubscriber();
		local_var_2_5.isDisposed();

		io.reactivex.subscribers.TestSubscriber<Object> local_var_2_6 = new io.reactivex.subscribers.TestSubscriber();
		local_var_2_6.isCancelled();

	}

	public void method2(
		io.reactivex.internal.disposables.ListCompositeDisposable param0,
		io.reactivex.subscribers.TestSubscriber<Object> param1,
		io.reactivex.subscribers.TestSubscriber<Object> param2) throws Throwable {
		param0.clear();

	}

	public void method3(
		io.reactivex.subscribers.TestSubscriber<Object> param0,
		io.reactivex.subscribers.TestSubscriber<Object> param1,
		io.reactivex.subscribers.TestSubscriber<Object> param2,
		io.reactivex.subscribers.TestSubscriber<Object> param3) throws Throwable {
		param0.dispose();

		param0.isCancelled();

		io.reactivex.internal.disposables.ListCompositeDisposable local_var_2_4 = new io.reactivex.internal.disposables.ListCompositeDisposable();
		local_var_2_4.isDisposed();

		io.reactivex.subscribers.TestSubscriber<Object> local_var_2_5 = new io.reactivex.subscribers.TestSubscriber();
		local_var_2_5.assertSubscribed();

	}
}
