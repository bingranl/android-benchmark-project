package com.android.example.module07_module39_module2_module2;

public class ClassAAJ {
	private 	com.android.example.module07_module39_module2_module5.ClassAAA instance_var_1_0 = new com.android.example.module07_module39_module2_module5.ClassAAA();
	private 	com.android.example.module07_module39_module2_module5.ClassAAG instance_var_1_1 = new com.android.example.module07_module39_module2_module5.ClassAAG();
	private 	com.android.example.module07_module39_module2_module5.ClassAAJ instance_var_1_2 = new com.android.example.module07_module39_module2_module5.ClassAAJ();

	public void method0(
		com.android.example.module07_module39_module2_module1.ClassAAA param0,
		com.android.example.module07_module39_module2_module1.ClassAAB param1,
		com.android.example.module07_module39_module2_module5.ClassAAB param2) throws Throwable {
	}

	public void method1(
		com.android.example.module07_module39_module2_module1.ClassAAD param0,
		com.android.example.module07_module39_module2_module1.ClassAAC param1,
		com.android.example.module07_module39_module2_module1.ClassAAD param2) throws Throwable {
	}

	public void method2(
		com.android.example.module07_module39_module2_module1.ClassAAB param0) throws Throwable {
		if (new java.lang.Object().equals(new java.lang.Object())) {
			param0.method1(new com.android.example.module07_module39_module2_module5.ClassAAJ(), new com.android.example.module07_module39_module2_module5.ClassAAA(), new com.android.example.module07_module39_module2_module5.ClassAAH());

		}
		io.reactivex.subscribers.TestSubscriber<Object> local_var_2_1 = new io.reactivex.subscribers.TestSubscriber();
		local_var_2_1.cancel();

		param0.method0(new com.android.example.module07_module39_module2_module5.ClassAAA(), new com.android.example.module07_module39_module2_module5.ClassAAB(), new com.android.example.module07_module39_module2_module5.ClassAAH());

	}

	public void method3(
		com.android.example.module07_module39_module2_module1.ClassAAA param0) throws Throwable {
		io.reactivex.subscribers.TestSubscriber<Object> local_var_2_1 = new io.reactivex.subscribers.TestSubscriber();
		local_var_2_1.onNext(new java.lang.Object());

		io.reactivex.internal.schedulers.IoScheduler local_var_2_2 = new io.reactivex.internal.schedulers.IoScheduler();
		local_var_2_2.start();

		io.reactivex.subscribers.TestSubscriber<Object> local_var_2_3 = new io.reactivex.subscribers.TestSubscriber();
		local_var_2_3.onComplete();

	}
}
