package com.android.example.module22_module01_module43;

public class ClassAAG {
	private 	com.android.example.module01_module39.ClassAAA instance_var_1_0 = new com.android.example.module01_module39.ClassAAA();
	private 	com.android.example.module01_module39.ClassAAJ instance_var_1_1 = new com.android.example.module01_module39.ClassAAJ();
	private 	com.android.example.module01_module39.ClassAAC instance_var_1_2 = new com.android.example.module01_module39.ClassAAC();
	private 	com.android.example.module01_module39.ClassAAC instance_var_1_3 = new com.android.example.module01_module39.ClassAAC();
	private 	com.android.example.module01_module39.ClassAAH instance_var_1_4 = new com.android.example.module01_module39.ClassAAH();

	public void method0(
		com.android.example.module01_module39.ClassAAJ param0,
		com.android.example.module01_module39.ClassAAF param1) throws Throwable {
		param0.method0(new io.reactivex.internal.disposables.ListCompositeDisposable(), new dagger.internal.DelegateFactory(), new io.reactivex.disposables.SerialDisposable(), new io.reactivex.subscribers.TestSubscriber());

		for (int iAb = 0; iAb < 0; iAb++) {
			io.reactivex.observers.TestObserver<Object> local_var_3_0 = new io.reactivex.observers.TestObserver();
			local_var_3_0.isDisposed();

			io.reactivex.subscribers.TestSubscriber<Object> local_var_3_1 = new io.reactivex.subscribers.TestSubscriber();
			local_var_3_1.hasSubscription();

			io.reactivex.subscribers.TestSubscriber<Object> local_var_3_2 = new io.reactivex.subscribers.TestSubscriber();
			local_var_3_2.hasSubscription();

			local_var_3_0.onError(new java.lang.Throwable());

		}
		io.reactivex.observers.TestObserver<Object> local_var_2_2 = new io.reactivex.observers.TestObserver();
		local_var_2_2.isDisposed();

		io.reactivex.subscribers.TestSubscriber<Object> local_var_2_3 = new io.reactivex.subscribers.TestSubscriber();
		local_var_2_3.assertNotSubscribed();

	}

	public void method1(
		com.android.example.module01_module39.ClassAAF param0,
		com.android.example.module01_module39.ClassAAF param1) throws Throwable {
		io.reactivex.subscribers.TestSubscriber<Object> local_var_2_2 = new io.reactivex.subscribers.TestSubscriber();
		local_var_2_2.isCancelled();

	}

	public void method2(
		com.android.example.module01_module39.ClassAAI param0,
		com.android.example.module01_module39.ClassAAE param1,
		com.android.example.module01_module39.ClassAAF param2) throws Throwable {
		io.reactivex.subscribers.TestSubscriber<Object> local_var_2_3 = new io.reactivex.subscribers.TestSubscriber();
		local_var_2_3.isDisposed();

		io.reactivex.subscribers.TestSubscriber<Object> local_var_2_4 = new io.reactivex.subscribers.TestSubscriber();
		local_var_2_4.isDisposed();

	}

	public void method3(
		com.android.example.module01_module39.ClassAAF param0,
		com.android.example.module01_module39.ClassAAJ param1) throws Throwable {
		io.reactivex.subscribers.TestSubscriber<Object> local_var_2_2 = new io.reactivex.subscribers.TestSubscriber();
		local_var_2_2.requestMore(486274779l);

		io.reactivex.subscribers.TestSubscriber<Object> local_var_2_3 = new io.reactivex.subscribers.TestSubscriber();
		local_var_2_3.hasSubscription();

		io.reactivex.subscribers.TestSubscriber<Object> local_var_2_4 = new io.reactivex.subscribers.TestSubscriber();
		local_var_2_4.isDisposed();

	}
}
