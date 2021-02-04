package com.android.example.module06_module025_module1;

public class ClassAAD {
	private 	com.android.example.module06_module025_module2.ClassAAE instance_var_1_0 = new com.android.example.module06_module025_module2.ClassAAE();
	private 	com.android.example.module06_module109_module1.ClassAAI instance_var_1_1 = new com.android.example.module06_module109_module1.ClassAAI();
	private 	com.android.example.module06_module109_module1.ClassAAE instance_var_1_2 = new com.android.example.module06_module109_module1.ClassAAE();

	public void method0(
		com.android.example.module06_module025_module2.ClassAAG param0,
		com.android.example.module06_module109_module1.ClassAAG param1,
		com.android.example.module06_module109_module1.ClassAAG param2,
		com.android.example.module06_module025_module2.ClassAAC param3) throws Throwable {
		for (int iAb = 0; iAb < 2; iAb++) {
			param0.method0(new io.reactivex.subscribers.TestSubscriber(), new io.reactivex.subscribers.TestSubscriber(), new io.reactivex.subscribers.TestSubscriber());

			io.reactivex.subscribers.TestSubscriber<Object> local_var_3_0 = new io.reactivex.subscribers.TestSubscriber();
			local_var_3_0.cancel();

			local_var_3_0.assertNotSubscribed();

		}
		io.reactivex.subscribers.TestSubscriber<Object> local_var_2_4 = new io.reactivex.subscribers.TestSubscriber();
		local_var_2_4.dispose();

	}

	public void method1(
		com.android.example.module06_module025_module2.ClassAAG param0) throws Throwable {
		io.reactivex.internal.schedulers.SingleScheduler local_var_2_1 = new io.reactivex.internal.schedulers.SingleScheduler();
		local_var_2_1.start();

		io.reactivex.subscribers.TestSubscriber<Object> local_var_2_2 = new io.reactivex.subscribers.TestSubscriber();
		local_var_2_2.cancel();

	}

	public void method2(
		com.android.example.module06_module025_module2.ClassAAG param0) throws Throwable {
		io.reactivex.subscribers.TestSubscriber<Object> local_var_2_1 = new io.reactivex.subscribers.TestSubscriber();
		local_var_2_1.requestMore(1262964240l);

		io.reactivex.subscribers.TestSubscriber<Object> local_var_2_2 = new io.reactivex.subscribers.TestSubscriber();
		local_var_2_2.onNext(new java.lang.Object());

		param0.method2(new io.reactivex.disposables.SerialDisposable(), new io.reactivex.subscribers.TestSubscriber());

		param0.method1(new io.reactivex.subscribers.TestSubscriber());

	}

	public void method3(
		com.android.example.module06_module025_module2.ClassAAC param0) throws Throwable {
		io.reactivex.subscribers.TestSubscriber<Object> local_var_2_1 = new io.reactivex.subscribers.TestSubscriber();
		local_var_2_1.onComplete();

		param0.method2(new io.reactivex.internal.disposables.ListCompositeDisposable(), new io.reactivex.subscribers.TestSubscriber(), new io.reactivex.subscribers.TestSubscriber());

		io.reactivex.subscribers.TestSubscriber<Object> local_var_2_2 = new io.reactivex.subscribers.TestSubscriber();
		local_var_2_2.assertNotSubscribed();

		io.reactivex.subscribers.TestSubscriber<Object> local_var_2_3 = new io.reactivex.subscribers.TestSubscriber();
		local_var_2_3.assertNotSubscribed();

	}

	public void method4(
		com.android.example.module06_module025_module2.ClassAAF param0,
		com.android.example.module06_module025_module2.ClassAAG param1,
		com.android.example.module06_module109_module1.ClassAAG param2,
		com.android.example.module06_module025_module2.ClassAAG param3) throws Throwable {
		param0.method3(new io.reactivex.subscribers.TestSubscriber());

		io.reactivex.subscribers.TestSubscriber<Object> local_var_2_4 = new io.reactivex.subscribers.TestSubscriber();
		local_var_2_4.isDisposed();

	}
}
