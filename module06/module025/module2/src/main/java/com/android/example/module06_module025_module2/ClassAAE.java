package com.android.example.module06_module025_module2;

public class ClassAAE {
	private 	io.reactivex.internal.schedulers.SingleScheduler instance_var_1_0 = new io.reactivex.internal.schedulers.SingleScheduler();
	private 	io.reactivex.subscribers.TestSubscriber<Object> instance_var_1_1 = new io.reactivex.subscribers.TestSubscriber();
	private 	io.reactivex.subscribers.TestSubscriber<Object> instance_var_1_2 = new io.reactivex.subscribers.TestSubscriber();

	public void method0(
		io.reactivex.internal.util.LinkedArrayList param0,
		io.reactivex.observers.TestObserver<Object> param1,
		io.reactivex.subscribers.TestSubscriber<Object> param2,
		io.reactivex.subscribers.TestSubscriber<Object> param3) throws Throwable {
	}

	public void method1(
		io.reactivex.subscribers.TestSubscriber<Object> param0) throws Throwable {
		java.util.Collections.emptyList().forEach( lambda0 -> {
			try {
				param0.assertNotSubscribed();

				for (int iAb = 0; iAb < 1; iAb++) {
					io.reactivex.subscribers.TestSubscriber<Object> local_var_4_0 = new io.reactivex.subscribers.TestSubscriber();
					local_var_4_0.assertSubscribed();

					io.reactivex.subscribers.TestSubscriber<Object> local_var_4_1 = new io.reactivex.subscribers.TestSubscriber();
					local_var_4_1.hasSubscription();

				}
			} catch(Throwable e) { } // ignore
		});
		io.reactivex.internal.util.OpenHashSet<Object> local_var_2_1 = new io.reactivex.internal.util.OpenHashSet();
		local_var_2_1.size();

		param0.onError(new java.lang.Throwable());

	}

	public void method2(
		io.reactivex.subscribers.TestSubscriber<Object> param0,
		io.reactivex.subscribers.TestSubscriber<Object> param1,
		io.reactivex.subscribers.TestSubscriber<Object> param2) throws Throwable {
		param0.assertNotSubscribed();

		io.reactivex.subscribers.TestSubscriber<Object> local_var_2_3 = new io.reactivex.subscribers.TestSubscriber();
		local_var_2_3.assertNotSubscribed();

		io.reactivex.subscribers.TestSubscriber<Object> local_var_2_4 = new io.reactivex.subscribers.TestSubscriber();
		local_var_2_4.hasSubscription();

		io.reactivex.subscribers.TestSubscriber<Object> local_var_2_5 = new io.reactivex.subscribers.TestSubscriber();
		local_var_2_5.assertSubscribed();

	}
}
