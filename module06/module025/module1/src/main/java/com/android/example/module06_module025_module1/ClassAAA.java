package com.android.example.module06_module025_module1;

public class ClassAAA {
	private 	com.android.example.module06_module025_module2.ClassAAC instance_var_1_0 = new com.android.example.module06_module025_module2.ClassAAC();
	private 	com.android.example.module06_module109_module1.ClassAAG instance_var_1_1 = new com.android.example.module06_module109_module1.ClassAAG();
	private 	com.android.example.module06_module025_module2.ClassAAA instance_var_1_2 = new com.android.example.module06_module025_module2.ClassAAA();
	private 	com.android.example.module06_module025_module2.ClassAAI instance_var_1_3 = new com.android.example.module06_module025_module2.ClassAAI();
	private 	com.android.example.module06_module109_module1.ClassAAC instance_var_1_4 = new com.android.example.module06_module109_module1.ClassAAC();

	public void method0(
		com.android.example.module06_module109_module1.ClassAAH param0,
		com.android.example.module06_module109_module1.ClassAAC param1) throws Throwable {
	}

	public void method1(
		com.android.example.module06_module025_module2.ClassAAG param0) throws Throwable {
		param0.method2(new io.reactivex.disposables.SerialDisposable(), new io.reactivex.subscribers.TestSubscriber());

		if (new java.lang.Object().equals(new java.lang.Object())) {
			for (int iAb = 0; iAb < 0; iAb++) {
				param0.method2(new io.reactivex.disposables.SerialDisposable(), new io.reactivex.subscribers.TestSubscriber());

				param0.method1(new io.reactivex.subscribers.TestSubscriber());

				io.reactivex.subscribers.TestSubscriber<Object> local_var_4_0 = new io.reactivex.subscribers.TestSubscriber();
				local_var_4_0.assertNotSubscribed();

			}
		}
		io.reactivex.subscribers.TestSubscriber<Object> local_var_2_1 = new io.reactivex.subscribers.TestSubscriber();
		local_var_2_1.assertNotSubscribed();

	}

	public void method2(
		com.android.example.module06_module109_module1.ClassAAD param0,
		com.android.example.module06_module109_module1.ClassAAB param1,
		com.android.example.module06_module109_module1.ClassAAB param2) throws Throwable {
		io.reactivex.internal.disposables.ListCompositeDisposable local_var_2_3 = new io.reactivex.internal.disposables.ListCompositeDisposable();
		local_var_2_3.clear();

		io.reactivex.subscribers.TestSubscriber<Object> local_var_2_4 = new io.reactivex.subscribers.TestSubscriber();
		local_var_2_4.requestMore(-1872260081l);

		io.reactivex.internal.disposables.ListCompositeDisposable local_var_2_5 = new io.reactivex.internal.disposables.ListCompositeDisposable();
		local_var_2_5.isDisposed();

		io.reactivex.subscribers.TestSubscriber<Object> local_var_2_6 = new io.reactivex.subscribers.TestSubscriber();
		local_var_2_6.cancel();

	}
}
