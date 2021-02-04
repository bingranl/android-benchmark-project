package com.android.example.module06_module257_module2;

public class ClassAAI {
	private 	com.android.example.module06_module257_module3.ClassAAC instance_var_1_0 = new com.android.example.module06_module257_module3.ClassAAC();
	private 	com.android.example.module06_module257_module1.ClassAAI instance_var_1_1 = new com.android.example.module06_module257_module1.ClassAAI();
	private 	com.android.example.module06_module257_module1.ClassAAI instance_var_1_2 = new com.android.example.module06_module257_module1.ClassAAI();

	public void method0(
		com.android.example.module06_module257_module3.ClassAAB param0,
		com.android.example.module06_module257_module1.ClassAAA param1,
		com.android.example.module06_module257_module3.ClassAAJ param2) throws Throwable {
		io.reactivex.subscribers.TestSubscriber<Object> local_var_2_3 = new io.reactivex.subscribers.TestSubscriber();
		local_var_2_3.onComplete();

		for (int iAb = 0; iAb < 0; iAb++) {
			for (int iAc = 0; iAc < 0; iAc++) {
				param0.method0(new io.reactivex.subscribers.TestSubscriber());

				io.reactivex.subscribers.TestSubscriber<Object> local_var_4_0 = new io.reactivex.subscribers.TestSubscriber();
				local_var_4_0.assertNotSubscribed();

			}
			param0.method1(new io.reactivex.internal.util.AppendOnlyLinkedArrayList(0), new io.reactivex.subscribers.TestSubscriber());

		}
	}

	public void method1(
		com.android.example.module06_module257_module3.ClassAAG param0) throws Throwable {
		io.reactivex.subscribers.TestSubscriber<Object> local_var_2_1 = new io.reactivex.subscribers.TestSubscriber();
		local_var_2_1.assertSubscribed();

		io.reactivex.subscribers.TestSubscriber<Object> local_var_2_2 = new io.reactivex.subscribers.TestSubscriber();
		local_var_2_2.onError(new java.lang.Throwable());

		param0.method1(new io.reactivex.subscribers.TestSubscriber(), new io.reactivex.subscribers.TestSubscriber(), new io.reactivex.disposables.SerialDisposable(), new io.reactivex.subscribers.TestSubscriber());

		param0.method0(new io.reactivex.internal.disposables.ListCompositeDisposable(), new io.reactivex.internal.disposables.ListCompositeDisposable(), new io.reactivex.subscribers.TestSubscriber(), new io.reactivex.subscribers.TestSubscriber());

	}

	public void method2(
		com.android.example.module06_module257_module1.ClassAAG param0,
		com.android.example.module06_module257_module3.ClassAAD param1,
		com.android.example.module06_module257_module1.ClassAAH param2,
		com.android.example.module06_module257_module3.ClassAAI param3) throws Throwable {
		io.reactivex.subscribers.TestSubscriber<Object> local_var_2_4 = new io.reactivex.subscribers.TestSubscriber();
		local_var_2_4.onComplete();

		io.reactivex.internal.disposables.ListCompositeDisposable local_var_2_5 = new io.reactivex.internal.disposables.ListCompositeDisposable();
		local_var_2_5.dispose();

		param0.method1(new com.android.example.module06_module257_module3.ClassAAJ(), new com.android.example.module06_module257_module3.ClassAAJ(), new com.android.example.module06_module257_module3.ClassAAF(), new com.android.example.module06_module257_module3.ClassAAI());

		io.reactivex.observers.TestObserver<Object> local_var_2_6 = new io.reactivex.observers.TestObserver();
		local_var_2_6.dispose();

	}

	public void method3(
		com.android.example.module06_module257_module3.ClassAAI param0,
		com.android.example.module06_module257_module1.ClassAAC param1,
		com.android.example.module06_module257_module1.ClassAAC param2) throws Throwable {
		io.reactivex.subscribers.TestSubscriber<Object> local_var_2_3 = new io.reactivex.subscribers.TestSubscriber();
		local_var_2_3.cancel();

		param0.method2(new io.reactivex.observers.TestObserver(), new io.reactivex.subscribers.TestSubscriber(), new io.reactivex.subscribers.TestSubscriber());

		io.reactivex.subscribers.TestSubscriber<Object> local_var_2_4 = new io.reactivex.subscribers.TestSubscriber();
		local_var_2_4.isDisposed();

		io.reactivex.internal.disposables.ListCompositeDisposable local_var_2_5 = new io.reactivex.internal.disposables.ListCompositeDisposable();
		local_var_2_5.isDisposed();

	}
}
