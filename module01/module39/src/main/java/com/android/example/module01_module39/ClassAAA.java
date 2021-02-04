package com.android.example.module01_module39;

public class ClassAAA {
	private 	io.reactivex.subscribers.TestSubscriber<Object> instance_var_1_0 = new io.reactivex.subscribers.TestSubscriber();
	private 	io.reactivex.subscribers.TestSubscriber<Object> instance_var_1_1 = new io.reactivex.subscribers.TestSubscriber();

	public void method0(
		io.reactivex.internal.disposables.ListCompositeDisposable param0,
		io.reactivex.subscribers.TestSubscriber<Object> param1,
		dagger.internal.DelegateFactory<Object> param2) throws Throwable {
		if (new java.lang.Object().equals(new java.lang.Object())) {
			param0.dispose();

		} else {
			if (new java.lang.Object().equals(new java.lang.Object())) {
				io.reactivex.subscribers.TestSubscriber<Object> local_var_4_0 = new io.reactivex.subscribers.TestSubscriber();
				local_var_4_0.isDisposed();

			} else {
				io.reactivex.subscribers.TestSubscriber<Object> local_var_4_0 = new io.reactivex.subscribers.TestSubscriber();
				local_var_4_0.assertNotSubscribed();

			}
		}
		param0.isDisposed();

		io.reactivex.internal.util.OpenHashSet<Object> local_var_2_3 = new io.reactivex.internal.util.OpenHashSet();
		local_var_2_3.remove(new java.lang.Object());

		dagger.internal.DelegateFactory<Object> local_var_2_4 = new dagger.internal.DelegateFactory();
		local_var_2_4.get();

	}

	public void method1(
		dagger.internal.DelegateFactory<Object> param0) throws Throwable {
		io.reactivex.subscribers.TestSubscriber<Object> local_var_2_1 = new io.reactivex.subscribers.TestSubscriber();
		local_var_2_1.isDisposed();

		param0.get();

	}

	public void method2(
		dagger.internal.DelegateFactory<Object> param0,
		dagger.internal.DelegateFactory<Object> param1,
		dagger.internal.DelegateFactory<Object> param2) throws Throwable {
		param0.get();

		io.reactivex.subscribers.TestSubscriber<Object> local_var_2_3 = new io.reactivex.subscribers.TestSubscriber();
		local_var_2_3.assertNotSubscribed();

		param0.get();

	}

	public void method3(
		io.reactivex.internal.disposables.ListCompositeDisposable param0,
		io.reactivex.subscribers.TestSubscriber<Object> param1,
		io.reactivex.subscribers.TestSubscriber<Object> param2,
		dagger.internal.DelegateFactory<Object> param3) throws Throwable {
		io.reactivex.subscribers.TestSubscriber<Object> local_var_2_4 = new io.reactivex.subscribers.TestSubscriber();
		local_var_2_4.requestMore(261227994l);

	}

	public void method4(
		io.reactivex.subscribers.TestSubscriber<Object> param0,
		dagger.internal.DelegateFactory<Object> param1,
		io.reactivex.subscribers.TestSubscriber<Object> param2) throws Throwable {
		io.reactivex.subscribers.TestSubscriber<Object> local_var_2_3 = new io.reactivex.subscribers.TestSubscriber();
		local_var_2_3.assertNotSubscribed();

		io.reactivex.subscribers.TestSubscriber<Object> local_var_2_4 = new io.reactivex.subscribers.TestSubscriber();
		local_var_2_4.assertSubscribed();

	}
}
