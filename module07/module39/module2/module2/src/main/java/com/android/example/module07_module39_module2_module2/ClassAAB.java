package com.android.example.module07_module39_module2_module2;

public class ClassAAB {
	private 	com.android.example.module07_module39_module2_module1.ClassAAB instance_var_1_0 = new com.android.example.module07_module39_module2_module1.ClassAAB();
	private 	com.android.example.module07_module39_module2_module1.ClassAAH instance_var_1_1 = new com.android.example.module07_module39_module2_module1.ClassAAH();

	public void method0(
		com.android.example.module07_module39_module2_module5.ClassAAD param0,
		com.android.example.module07_module39_module2_module1.ClassAAI param1,
		com.android.example.module07_module39_module2_module5.ClassAAD param2,
		com.android.example.module07_module39_module2_module1.ClassAAC param3) throws Throwable {
		for (int iAb = 0; iAb < 2; iAb++) {
			param0.method2(new io.reactivex.subscribers.TestSubscriber(), new io.reactivex.subscribers.TestSubscriber(), new io.reactivex.subscribers.TestSubscriber(), new io.reactivex.internal.schedulers.IoScheduler());

		}
	}

	public void method1(
		com.android.example.module07_module39_module2_module5.ClassAAD param0,
		com.android.example.module07_module39_module2_module5.ClassAAB param1) throws Throwable {
		io.reactivex.subscribers.TestSubscriber<Object> local_var_2_2 = new io.reactivex.subscribers.TestSubscriber();
		local_var_2_2.onError(new java.lang.Throwable());

		io.reactivex.subscribers.TestSubscriber<Object> local_var_2_3 = new io.reactivex.subscribers.TestSubscriber();
		local_var_2_3.isCancelled();

		param0.method1(new io.reactivex.subscribers.TestSubscriber(), new io.reactivex.subscribers.TestSubscriber());

	}

	public void method2(
		com.android.example.module07_module39_module2_module5.ClassAAG param0,
		com.android.example.module07_module39_module2_module5.ClassAAF param1) throws Throwable {
	}

	public void method3(
		com.android.example.module07_module39_module2_module1.ClassAAD param0) throws Throwable {
		io.reactivex.subscribers.TestSubscriber<Object> local_var_2_1 = new io.reactivex.subscribers.TestSubscriber();
		local_var_2_1.assertSubscribed();

		io.reactivex.subscribers.TestSubscriber<Object> local_var_2_2 = new io.reactivex.subscribers.TestSubscriber();
		local_var_2_2.isCancelled();

		io.reactivex.subscribers.TestSubscriber<Object> local_var_2_3 = new io.reactivex.subscribers.TestSubscriber();
		local_var_2_3.assertSubscribed();

		io.reactivex.disposables.SerialDisposable local_var_2_4 = new io.reactivex.disposables.SerialDisposable();
		local_var_2_4.isDisposed();

	}

	public void method4(
		com.android.example.module07_module39_module2_module1.ClassAAH param0,
		com.android.example.module07_module39_module2_module5.ClassAAA param1,
		com.android.example.module07_module39_module2_module1.ClassAAG param2) throws Throwable {
	}
}
