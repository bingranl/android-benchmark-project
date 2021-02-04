package com.android.example.module06_module025_module2;

public class ClassAAH {
	private 	io.reactivex.subscribers.TestSubscriber<Object> instance_var_1_0 = new io.reactivex.subscribers.TestSubscriber();
	private 	io.reactivex.subscribers.TestSubscriber<Object> instance_var_1_1 = new io.reactivex.subscribers.TestSubscriber();
	private 	io.reactivex.internal.util.LinkedArrayList instance_var_1_2 = new io.reactivex.internal.util.LinkedArrayList(24);
	private 	io.reactivex.subscribers.TestSubscriber<Object> instance_var_1_3 = new io.reactivex.subscribers.TestSubscriber();

	public void method0(
		io.reactivex.subscribers.TestSubscriber<Object> param0,
		io.reactivex.subscribers.TestSubscriber<Object> param1,
		io.reactivex.subscribers.TestSubscriber<Object> param2,
		io.reactivex.schedulers.TestScheduler param3) throws Throwable {
		if (new java.lang.Object().equals(new java.lang.Object())) {
			for (int iAb = 0; iAb < 6; iAb++) {
				param0.onError(new java.lang.Throwable());

				io.reactivex.subscribers.TestSubscriber<Object> local_var_4_0 = new io.reactivex.subscribers.TestSubscriber();
				local_var_4_0.assertNotSubscribed();

				local_var_4_0.onNext(new java.lang.Object());

				io.reactivex.subscribers.TestSubscriber<Object> local_var_4_1 = new io.reactivex.subscribers.TestSubscriber();
				local_var_4_1.hasSubscription();

			}
		}
		io.reactivex.subscribers.TestSubscriber<Object> local_var_2_4 = new io.reactivex.subscribers.TestSubscriber();
		local_var_2_4.isDisposed();

		io.reactivex.subscribers.TestSubscriber<Object> local_var_2_5 = new io.reactivex.subscribers.TestSubscriber();
		local_var_2_5.assertSubscribed();

	}

	public void method1(
		io.reactivex.subscribers.TestSubscriber<Object> param0,
		io.reactivex.internal.disposables.ListCompositeDisposable param1,
		io.reactivex.internal.disposables.ListCompositeDisposable param2,
		io.reactivex.subscribers.TestSubscriber<Object> param3) throws Throwable {
		param0.onError(new java.lang.Throwable());

	}
}
