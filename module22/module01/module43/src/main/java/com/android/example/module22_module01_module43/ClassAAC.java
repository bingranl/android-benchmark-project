package com.android.example.module22_module01_module43;

public class ClassAAC {
	private 	com.android.example.module01_module39.ClassAAJ instance_var_1_0 = new com.android.example.module01_module39.ClassAAJ();
	private 	com.android.example.module01_module39.ClassAAG instance_var_1_1 = new com.android.example.module01_module39.ClassAAG();
	private 	com.android.example.module01_module39.ClassAAF instance_var_1_2 = new com.android.example.module01_module39.ClassAAF();

	public void method0(
		com.android.example.module01_module39.ClassAAC param0,
		com.android.example.module01_module39.ClassAAA param1,
		com.android.example.module01_module39.ClassAAA param2) throws Throwable {
		if (new java.lang.Object().equals(new java.lang.Object())) {
			param0.method2(new io.reactivex.subscribers.TestSubscriber(), new io.reactivex.subscribers.TestSubscriber(), new io.reactivex.subscribers.TestSubscriber(), new io.reactivex.observers.TestObserver());

		} else {
			io.reactivex.subscribers.TestSubscriber<Object> local_var_3_0 = new io.reactivex.subscribers.TestSubscriber();
			local_var_3_0.hasSubscription();

		}
		io.reactivex.disposables.SerialDisposable local_var_2_3 = new io.reactivex.disposables.SerialDisposable();
		local_var_2_3.get();

		io.reactivex.subscribers.TestSubscriber<Object> local_var_2_4 = new io.reactivex.subscribers.TestSubscriber();
		local_var_2_4.assertNotSubscribed();

	}

	public void method1(
		com.android.example.module01_module39.ClassAAA param0) throws Throwable {
		io.reactivex.subscribers.TestSubscriber<Object> local_var_2_1 = new io.reactivex.subscribers.TestSubscriber();
		local_var_2_1.requestMore(811129842l);

		io.reactivex.subscribers.TestSubscriber<Object> local_var_2_2 = new io.reactivex.subscribers.TestSubscriber();
		local_var_2_2.isDisposed();

	}
}
