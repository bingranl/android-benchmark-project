package com.android.example.module06_module025_module2;

public class ClassAAA {
	private 	io.reactivex.subscribers.TestSubscriber<Object> instance_var_1_0 = new io.reactivex.subscribers.TestSubscriber();
	private 	io.reactivex.subscribers.TestSubscriber<Object> instance_var_1_1 = new io.reactivex.subscribers.TestSubscriber();
	private 	io.reactivex.subscribers.TestSubscriber<Object> instance_var_1_2 = new io.reactivex.subscribers.TestSubscriber();
	private 	io.reactivex.subscribers.TestSubscriber<Object> instance_var_1_3 = new io.reactivex.subscribers.TestSubscriber();

	public void method0(
		io.reactivex.subscribers.TestSubscriber<Object> param0,
		io.reactivex.subscribers.TestSubscriber<Object> param1) throws Throwable {
		param0.dispose();

		param0.requestMore(455567973l);

		for (int iAb = 0; iAb < 6; iAb++) {
			io.reactivex.subscribers.TestSubscriber<Object> local_var_3_0 = new io.reactivex.subscribers.TestSubscriber();
			local_var_3_0.isCancelled();

			local_var_3_0.assertNotSubscribed();

		}
		param0.hasSubscription();

	}

	public void method1(
		io.reactivex.subscribers.TestSubscriber<Object> param0,
		io.reactivex.observers.TestObserver<Object> param1) throws Throwable {
		io.reactivex.subscribers.TestSubscriber<Object> local_var_2_2 = new io.reactivex.subscribers.TestSubscriber();
		local_var_2_2.assertSubscribed();

		io.reactivex.internal.disposables.ListCompositeDisposable local_var_2_3 = new io.reactivex.internal.disposables.ListCompositeDisposable();
		local_var_2_3.isDisposed();

	}

	public void method2(
		io.reactivex.subscribers.TestSubscriber<Object> param0,
		io.reactivex.subscribers.TestSubscriber<Object> param1,
		io.reactivex.subscribers.TestSubscriber<Object> param2,
		io.reactivex.subscribers.TestSubscriber<Object> param3) throws Throwable {
		io.reactivex.internal.disposables.ListCompositeDisposable local_var_2_4 = new io.reactivex.internal.disposables.ListCompositeDisposable();
		local_var_2_4.isDisposed();

		param0.assertNotSubscribed();

		io.reactivex.subscribers.TestSubscriber<Object> local_var_2_5 = new io.reactivex.subscribers.TestSubscriber();
		local_var_2_5.assertNotSubscribed();

	}

	public void method3(
		io.reactivex.subscribers.TestSubscriber<Object> param0,
		io.reactivex.internal.disposables.ListCompositeDisposable param1,
		io.reactivex.subscribers.TestSubscriber<Object> param2) throws Throwable {
		io.reactivex.subscribers.TestSubscriber<Object> local_var_2_3 = new io.reactivex.subscribers.TestSubscriber();
		local_var_2_3.requestMore(-523851691l);

		param0.assertSubscribed();

	}
}
