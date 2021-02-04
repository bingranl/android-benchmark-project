package com.android.example.module22_module01_module43;

public class ClassAAI {
	private 	com.android.example.module01_module39.ClassAAB instance_var_1_0 = new com.android.example.module01_module39.ClassAAB();
	private 	com.android.example.module01_module39.ClassAAH instance_var_1_1 = new com.android.example.module01_module39.ClassAAH();
	private 	com.android.example.module01_module39.ClassAAJ instance_var_1_2 = new com.android.example.module01_module39.ClassAAJ();

	public void method0(
		com.android.example.module01_module39.ClassAAC param0) throws Throwable {
		param0.method0(new dagger.internal.DelegateFactory(), new io.reactivex.subscribers.TestSubscriber());

	}

	public void method1(
		com.android.example.module01_module39.ClassAAE param0,
		com.android.example.module01_module39.ClassAAB param1,
		com.android.example.module01_module39.ClassAAA param2,
		com.android.example.module01_module39.ClassAAA param3) throws Throwable {
		if (new java.lang.Object().equals(new java.lang.Object())) {
			io.reactivex.subscribers.TestSubscriber<Object> local_var_3_0 = new io.reactivex.subscribers.TestSubscriber();
			local_var_3_0.hasSubscription();

		}
		io.reactivex.subscribers.TestSubscriber<Object> local_var_2_4 = new io.reactivex.subscribers.TestSubscriber();
		local_var_2_4.isCancelled();

		io.reactivex.subscribers.TestSubscriber<Object> local_var_2_5 = new io.reactivex.subscribers.TestSubscriber();
		local_var_2_5.requestMore(809728190l);

		io.reactivex.subscribers.TestSubscriber<Object> local_var_2_6 = new io.reactivex.subscribers.TestSubscriber();
		local_var_2_6.hasSubscription();

	}

	public void method2(
		com.android.example.module01_module39.ClassAAB param0,
		com.android.example.module01_module39.ClassAAD param1) throws Throwable {
		io.reactivex.subscribers.TestSubscriber<Object> local_var_2_2 = new io.reactivex.subscribers.TestSubscriber();
		local_var_2_2.assertSubscribed();

		param0.method1(new dagger.internal.DelegateFactory(), new dagger.internal.DelegateFactory(), new dagger.internal.DelegateFactory());

		io.reactivex.subscribers.TestSubscriber<Object> local_var_2_3 = new io.reactivex.subscribers.TestSubscriber();
		local_var_2_3.hasSubscription();

	}

	public void method3(
		com.android.example.module01_module39.ClassAAB param0,
		com.android.example.module01_module39.ClassAAA param1,
		com.android.example.module01_module39.ClassAAE param2,
		com.android.example.module01_module39.ClassAAE param3) throws Throwable {
		param0.method1(new dagger.internal.DelegateFactory(), new dagger.internal.DelegateFactory(), new dagger.internal.DelegateFactory());

		param0.method0(new dagger.internal.DelegateFactory(), new io.reactivex.internal.disposables.ListCompositeDisposable(), new io.reactivex.subscribers.TestSubscriber());

		io.reactivex.subscribers.TestSubscriber<Object> local_var_2_4 = new io.reactivex.subscribers.TestSubscriber();
		local_var_2_4.isDisposed();

		io.reactivex.subscribers.TestSubscriber<Object> local_var_2_5 = new io.reactivex.subscribers.TestSubscriber();
		local_var_2_5.isCancelled();

	}
}
