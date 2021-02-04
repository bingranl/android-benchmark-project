package com.android.example.module07_module39_module2_module2;

public class ClassAAE {
	private 	com.android.example.module07_module39_module2_module1.ClassAAH instance_var_1_0 = new com.android.example.module07_module39_module2_module1.ClassAAH();
	private 	com.android.example.module07_module39_module2_module1.ClassAAB instance_var_1_1 = new com.android.example.module07_module39_module2_module1.ClassAAB();
	private 	com.android.example.module07_module39_module2_module5.ClassAAE instance_var_1_2 = new com.android.example.module07_module39_module2_module5.ClassAAE();
	private 	com.android.example.module07_module39_module2_module5.ClassAAB instance_var_1_3 = new com.android.example.module07_module39_module2_module5.ClassAAB();
	private 	com.android.example.module07_module39_module2_module5.ClassAAJ instance_var_1_4 = new com.android.example.module07_module39_module2_module5.ClassAAJ();

	public void method0(
		com.android.example.module07_module39_module2_module5.ClassAAE param0,
		com.android.example.module07_module39_module2_module1.ClassAAE param1,
		com.android.example.module07_module39_module2_module1.ClassAAA param2,
		com.android.example.module07_module39_module2_module1.ClassAAB param3) throws Throwable {
		io.reactivex.subscribers.TestSubscriber<Object> local_var_2_4 = new io.reactivex.subscribers.TestSubscriber();
		local_var_2_4.cancel();

		io.reactivex.subscribers.TestSubscriber<Object> local_var_2_5 = new io.reactivex.subscribers.TestSubscriber();
		local_var_2_5.isDisposed();

		for (int iAb = 0; iAb < 0; iAb++) {
			io.reactivex.internal.disposables.ListCompositeDisposable local_var_3_0 = new io.reactivex.internal.disposables.ListCompositeDisposable();
			local_var_3_0.clear();

			io.reactivex.schedulers.TestScheduler local_var_3_1 = new io.reactivex.schedulers.TestScheduler();
			local_var_3_1.createWorker();

			local_var_3_0.isDisposed();

			local_var_3_0.dispose();

		}
		io.reactivex.subscribers.TestSubscriber<Object> local_var_2_6 = new io.reactivex.subscribers.TestSubscriber();
		local_var_2_6.requestMore(-915821865l);

	}

	public void method1(
		com.android.example.module07_module39_module2_module5.ClassAAG param0,
		com.android.example.module07_module39_module2_module1.ClassAAA param1,
		com.android.example.module07_module39_module2_module1.ClassAAA param2,
		com.android.example.module07_module39_module2_module1.ClassAAJ param3) throws Throwable {
		io.reactivex.subscribers.TestSubscriber<Object> local_var_2_4 = new io.reactivex.subscribers.TestSubscriber();
		local_var_2_4.assertNotSubscribed();

		param0.method0(new io.reactivex.subscribers.TestSubscriber());

		param0.method2(new io.reactivex.subscribers.TestSubscriber());

		io.reactivex.internal.disposables.ListCompositeDisposable local_var_2_5 = new io.reactivex.internal.disposables.ListCompositeDisposable();
		local_var_2_5.clear();

	}

	public void method2(
		com.android.example.module07_module39_module2_module1.ClassAAE param0) throws Throwable {
	}

	public void method3(
		com.android.example.module07_module39_module2_module5.ClassAAB param0) throws Throwable {
	}

	public void method4(
		com.android.example.module07_module39_module2_module1.ClassAAF param0,
		com.android.example.module07_module39_module2_module5.ClassAAF param1,
		com.android.example.module07_module39_module2_module5.ClassAAH param2) throws Throwable {
		param0.method0(new com.android.example.module07_module39_module2_module5.ClassAAI(), new com.android.example.module07_module39_module2_module5.ClassAAH());

	}
}
