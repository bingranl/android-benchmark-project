package com.android.example.module01_module39;

public class ClassAAI {
	private 	io.reactivex.subscribers.TestSubscriber<Object> instance_var_1_0 = new io.reactivex.subscribers.TestSubscriber();
	private 	io.reactivex.subscribers.TestSubscriber<Object> instance_var_1_1 = new io.reactivex.subscribers.TestSubscriber();
	private 	io.reactivex.subscribers.TestSubscriber<Object> instance_var_1_2 = new io.reactivex.subscribers.TestSubscriber();

	public void method0(
		dagger.internal.DelegateFactory<Object> param0,
		io.reactivex.subscribers.TestSubscriber<Object> param1) throws Throwable {
	}

	public void method1(
		io.reactivex.subscribers.TestSubscriber<Object> param0,
		io.reactivex.subscribers.TestSubscriber<Object> param1,
		io.reactivex.subscribers.TestSubscriber<Object> param2) throws Throwable {
		dagger.internal.DelegateFactory<Object> local_var_2_3 = new dagger.internal.DelegateFactory();
		local_var_2_3.get();

		for (int iAb = 0; iAb < 6; iAb++) {
			if (new java.lang.Object().equals(new java.lang.Object())) {
				param0.isCancelled();

			} else {
				io.reactivex.subscribers.TestSubscriber<Object> local_var_4_0 = new io.reactivex.subscribers.TestSubscriber();
				local_var_4_0.assertNotSubscribed();

			}
			io.reactivex.subscribers.TestSubscriber<Object> local_var_3_0 = new io.reactivex.subscribers.TestSubscriber();
			local_var_3_0.assertNotSubscribed();

		}
	}

	public void method2(
		dagger.internal.DelegateFactory<Object> param0,
		io.reactivex.subscribers.TestSubscriber<Object> param1,
		io.reactivex.subscribers.TestSubscriber<Object> param2,
		io.reactivex.subscribers.TestSubscriber<Object> param3) throws Throwable {
		param0.get();

	}

	public void method3(
		dagger.internal.DelegateFactory<Object> param0,
		io.reactivex.subscribers.TestSubscriber<Object> param1) throws Throwable {
		param0.get();

		dagger.internal.DelegateFactory<Object> local_var_2_2 = new dagger.internal.DelegateFactory();
		local_var_2_2.get();

		param0.get();

	}

	public void method4(
		io.reactivex.subscribers.TestSubscriber<Object> param0) throws Throwable {
		io.reactivex.subscribers.TestSubscriber<Object> local_var_2_1 = new io.reactivex.subscribers.TestSubscriber();
		local_var_2_1.assertNotSubscribed();

		io.reactivex.subscribers.TestSubscriber<Object> local_var_2_2 = new io.reactivex.subscribers.TestSubscriber();
		local_var_2_2.isCancelled();

		io.reactivex.subscribers.TestSubscriber<Object> local_var_2_3 = new io.reactivex.subscribers.TestSubscriber();
		local_var_2_3.requestMore(1348072073l);

	}
}
