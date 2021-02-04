package com.android.example.module06_module025_module1;

public class ClassAAI {
	private 	com.android.example.module06_module025_module2.ClassAAB instance_var_1_0 = new com.android.example.module06_module025_module2.ClassAAB();
	private 	com.android.example.module06_module025_module2.ClassAAF instance_var_1_1 = new com.android.example.module06_module025_module2.ClassAAF();
	private 	com.android.example.module06_module109_module1.ClassAAG instance_var_1_2 = new com.android.example.module06_module109_module1.ClassAAG();
	private 	com.android.example.module06_module025_module2.ClassAAF instance_var_1_3 = new com.android.example.module06_module025_module2.ClassAAF();

	public void method0(
		com.android.example.module06_module025_module2.ClassAAI param0,
		com.android.example.module06_module109_module1.ClassAAA param1,
		com.android.example.module06_module025_module2.ClassAAF param2,
		com.android.example.module06_module109_module1.ClassAAB param3) throws Throwable {
		io.reactivex.subscribers.TestSubscriber<Object> local_var_2_4 = new io.reactivex.subscribers.TestSubscriber();
		local_var_2_4.assertSubscribed();

		io.reactivex.subscribers.TestSubscriber<Object> local_var_2_5 = new io.reactivex.subscribers.TestSubscriber();
		local_var_2_5.assertNotSubscribed();

	}

	public void method1(
		com.android.example.module06_module109_module1.ClassAAJ param0,
		com.android.example.module06_module109_module1.ClassAAG param1,
		com.android.example.module06_module109_module1.ClassAAA param2) throws Throwable {
		param0.method1("SomeString", "SomeString", "SomeString", "SomeString");

	}

	public void method2(
		com.android.example.module06_module025_module2.ClassAAI param0,
		com.android.example.module06_module025_module2.ClassAAB param1) throws Throwable {
	}

	public void method3(
		com.android.example.module06_module025_module2.ClassAAE param0,
		com.android.example.module06_module025_module2.ClassAAC param1,
		com.android.example.module06_module025_module2.ClassAAI param2,
		com.android.example.module06_module109_module1.ClassAAJ param3) throws Throwable {
		io.reactivex.subscribers.TestSubscriber<Object> local_var_2_4 = new io.reactivex.subscribers.TestSubscriber();
		local_var_2_4.isDisposed();

		param0.method1(new io.reactivex.subscribers.TestSubscriber());

		io.reactivex.subscribers.TestSubscriber<Object> local_var_2_5 = new io.reactivex.subscribers.TestSubscriber();
		local_var_2_5.onComplete();

		io.reactivex.subscribers.TestSubscriber<Object> local_var_2_6 = new io.reactivex.subscribers.TestSubscriber();
		local_var_2_6.cancel();

	}

	public void method4(
		com.android.example.module06_module025_module2.ClassAAC param0,
		com.android.example.module06_module025_module2.ClassAAE param1) throws Throwable {
		io.reactivex.internal.util.LinkedArrayList local_var_2_2 = new io.reactivex.internal.util.LinkedArrayList(32);
		local_var_2_2.add(new java.lang.Object());

		param0.method1(new io.reactivex.internal.disposables.ListCompositeDisposable(), new io.reactivex.subscribers.TestSubscriber(), new io.reactivex.subscribers.TestSubscriber());

		io.reactivex.subscribers.TestSubscriber<Object> local_var_2_3 = new io.reactivex.subscribers.TestSubscriber();
		local_var_2_3.dispose();

	}
}
