package com.android.example.module22_module01_module43;

public class ClassAAJ {
	private 	com.android.example.module01_module39.ClassAAC instance_var_1_0 = new com.android.example.module01_module39.ClassAAC();
	private 	com.android.example.module01_module39.ClassAAJ instance_var_1_1 = new com.android.example.module01_module39.ClassAAJ();
	private 	com.android.example.module01_module39.ClassAAB instance_var_1_2 = new com.android.example.module01_module39.ClassAAB();
	private 	com.android.example.module01_module39.ClassAAI instance_var_1_3 = new com.android.example.module01_module39.ClassAAI();

	public void method0(
		com.android.example.module01_module39.ClassAAF param0,
		com.android.example.module01_module39.ClassAAE param1,
		com.android.example.module01_module39.ClassAAB param2,
		com.android.example.module01_module39.ClassAAB param3) throws Throwable {
	}

	public void method1(
		com.android.example.module01_module39.ClassAAJ param0) throws Throwable {
		io.reactivex.internal.disposables.ListCompositeDisposable local_var_2_1 = new io.reactivex.internal.disposables.ListCompositeDisposable();
		local_var_2_1.isDisposed();

		if (new java.lang.Object().equals(new java.lang.Object())) {
			for (int iAb = 0; iAb < 0; iAb++) {
				io.reactivex.subscribers.TestSubscriber<Object> local_var_4_0 = new io.reactivex.subscribers.TestSubscriber();
				local_var_4_0.isCancelled();

				local_var_4_0.onError(new java.lang.Throwable());

				io.reactivex.internal.disposables.ListCompositeDisposable local_var_4_1 = new io.reactivex.internal.disposables.ListCompositeDisposable();
				local_var_4_1.isDisposed();

			}
		} else {
			io.reactivex.internal.util.LinkedArrayList local_var_3_0 = new io.reactivex.internal.util.LinkedArrayList(77);
			local_var_3_0.head();

		}
		io.reactivex.subscribers.TestSubscriber<Object> local_var_2_2 = new io.reactivex.subscribers.TestSubscriber();
		local_var_2_2.assertNotSubscribed();

		param0.method1(new io.reactivex.subscribers.TestSubscriber(), new io.reactivex.subscribers.TestSubscriber(), new io.reactivex.subscribers.TestSubscriber(), new io.reactivex.internal.util.OpenHashSet());

	}

	public void method2(
		com.android.example.module01_module39.ClassAAH param0) throws Throwable {
		io.reactivex.subscribers.TestSubscriber<Object> local_var_2_1 = new io.reactivex.subscribers.TestSubscriber();
		local_var_2_1.isDisposed();

	}

	public void method3(
		com.android.example.module01_module39.ClassAAD param0,
		com.android.example.module01_module39.ClassAAE param1,
		com.android.example.module01_module39.ClassAAI param2) throws Throwable {
		param0.method0(new io.reactivex.subscribers.TestSubscriber(), new io.reactivex.subscribers.TestSubscriber(), new io.reactivex.subscribers.TestSubscriber());

	}
}
