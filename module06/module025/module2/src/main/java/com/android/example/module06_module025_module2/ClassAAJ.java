package com.android.example.module06_module025_module2;

public class ClassAAJ {
	private 	io.reactivex.subscribers.TestSubscriber<Object> instance_var_1_0 = new io.reactivex.subscribers.TestSubscriber();
	private 	io.reactivex.subscribers.TestSubscriber<Object> instance_var_1_1 = new io.reactivex.subscribers.TestSubscriber();

	public void method0(
		io.reactivex.subscribers.TestSubscriber<Object> param0) throws Throwable {
		for (int iAb = 0; iAb < 6; iAb++) {
			java.util.Collections.emptyList().forEach( lambda0 -> {
				try {
					io.reactivex.subscribers.TestSubscriber<Object> local_var_4_0 = new io.reactivex.subscribers.TestSubscriber();
					local_var_4_0.assertSubscribed();

				} catch(Throwable e) { } // ignore
			});
			io.reactivex.internal.schedulers.IoScheduler local_var_3_0 = new io.reactivex.internal.schedulers.IoScheduler();
			local_var_3_0.createWorker();

			io.reactivex.subscribers.TestSubscriber<Object> local_var_3_1 = new io.reactivex.subscribers.TestSubscriber();
			local_var_3_1.assertSubscribed();

			io.reactivex.subscribers.TestSubscriber<Object> local_var_3_2 = new io.reactivex.subscribers.TestSubscriber();
			local_var_3_2.isDisposed();

		}
		io.reactivex.subscribers.TestSubscriber<Object> local_var_2_1 = new io.reactivex.subscribers.TestSubscriber();
		local_var_2_1.assertSubscribed();

	}

	public void method1(
		io.reactivex.subscribers.TestSubscriber<Object> param0,
		io.reactivex.subscribers.TestSubscriber<Object> param1) throws Throwable {
		param0.hasSubscription();

	}

	public void method2(
		io.reactivex.subscribers.TestSubscriber<Object> param0,
		io.reactivex.subscribers.TestSubscriber<Object> param1,
		io.reactivex.subscribers.TestSubscriber<Object> param2) throws Throwable {
		io.reactivex.subscribers.TestSubscriber<Object> local_var_2_3 = new io.reactivex.subscribers.TestSubscriber();
		local_var_2_3.requestMore(1226158380l);

	}

	public void method3(
		io.reactivex.subscribers.TestSubscriber<Object> param0) throws Throwable {
	}
}
