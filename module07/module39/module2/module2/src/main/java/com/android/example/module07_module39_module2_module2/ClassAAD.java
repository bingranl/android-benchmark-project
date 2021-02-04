package com.android.example.module07_module39_module2_module2;

public class ClassAAD {
	private 	com.android.example.module07_module39_module2_module1.ClassAAF instance_var_1_0 = new com.android.example.module07_module39_module2_module1.ClassAAF();
	private 	com.android.example.module07_module39_module2_module1.ClassAAC instance_var_1_1 = new com.android.example.module07_module39_module2_module1.ClassAAC();
	private 	com.android.example.module07_module39_module2_module1.ClassAAG instance_var_1_2 = new com.android.example.module07_module39_module2_module1.ClassAAG();
	private 	com.android.example.module07_module39_module2_module5.ClassAAI instance_var_1_3 = new com.android.example.module07_module39_module2_module5.ClassAAI();
	private 	com.android.example.module07_module39_module2_module5.ClassAAE instance_var_1_4 = new com.android.example.module07_module39_module2_module5.ClassAAE();

	public void method0(
		com.android.example.module07_module39_module2_module5.ClassAAI param0,
		com.android.example.module07_module39_module2_module1.ClassAAI param1,
		com.android.example.module07_module39_module2_module1.ClassAAD param2,
		com.android.example.module07_module39_module2_module5.ClassAAB param3) throws Throwable {
		if (new java.lang.Object().equals(new java.lang.Object())) {
			io.reactivex.subscribers.TestSubscriber<Object> local_var_3_0 = new io.reactivex.subscribers.TestSubscriber();
			local_var_3_0.onError(new java.lang.Throwable());

		} else {
			io.reactivex.subscribers.TestSubscriber<Object> local_var_3_0 = new io.reactivex.subscribers.TestSubscriber();
			local_var_3_0.dispose();

		}
		io.reactivex.subscribers.TestSubscriber<Object> local_var_2_4 = new io.reactivex.subscribers.TestSubscriber();
		local_var_2_4.onNext(new java.lang.Object());

		param0.method2(new io.reactivex.schedulers.TestScheduler(), new io.reactivex.subscribers.TestSubscriber(), new io.reactivex.internal.disposables.ListCompositeDisposable());

	}

	public void method1(
		com.android.example.module07_module39_module2_module5.ClassAAI param0,
		com.android.example.module07_module39_module2_module5.ClassAAB param1,
		com.android.example.module07_module39_module2_module1.ClassAAG param2,
		com.android.example.module07_module39_module2_module5.ClassAAD param3) throws Throwable {
		io.reactivex.internal.disposables.ListCompositeDisposable local_var_2_4 = new io.reactivex.internal.disposables.ListCompositeDisposable();
		local_var_2_4.isDisposed();

	}

	public void method2(
		com.android.example.module07_module39_module2_module1.ClassAAF param0,
		com.android.example.module07_module39_module2_module5.ClassAAC param1) throws Throwable {
		param0.method0(new com.android.example.module07_module39_module2_module5.ClassAAI(), new com.android.example.module07_module39_module2_module5.ClassAAH());

	}

	public void method3(
		com.android.example.module07_module39_module2_module1.ClassAAH param0,
		com.android.example.module07_module39_module2_module1.ClassAAB param1,
		com.android.example.module07_module39_module2_module5.ClassAAE param2) throws Throwable {
		io.reactivex.subscribers.TestSubscriber<Object> local_var_2_3 = new io.reactivex.subscribers.TestSubscriber();
		local_var_2_3.onNext(new java.lang.Object());

		io.reactivex.subscribers.TestSubscriber<Object> local_var_2_4 = new io.reactivex.subscribers.TestSubscriber();
		local_var_2_4.dispose();

	}
}
