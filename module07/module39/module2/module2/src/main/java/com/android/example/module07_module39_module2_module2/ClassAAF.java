package com.android.example.module07_module39_module2_module2;

public class ClassAAF {
	private 	com.android.example.module07_module39_module2_module1.ClassAAE instance_var_1_0 = new com.android.example.module07_module39_module2_module1.ClassAAE();
	private 	com.android.example.module07_module39_module2_module1.ClassAAG instance_var_1_1 = new com.android.example.module07_module39_module2_module1.ClassAAG();
	private 	com.android.example.module07_module39_module2_module1.ClassAAJ instance_var_1_2 = new com.android.example.module07_module39_module2_module1.ClassAAJ();
	private 	com.android.example.module07_module39_module2_module1.ClassAAI instance_var_1_3 = new com.android.example.module07_module39_module2_module1.ClassAAI();

	public void method0(
		com.android.example.module07_module39_module2_module1.ClassAAB param0,
		com.android.example.module07_module39_module2_module5.ClassAAG param1,
		com.android.example.module07_module39_module2_module1.ClassAAD param2) throws Throwable {
	}

	public void method1(
		com.android.example.module07_module39_module2_module1.ClassAAE param0,
		com.android.example.module07_module39_module2_module1.ClassAAB param1) throws Throwable {
		if (new java.lang.Object().equals(new java.lang.Object())) {
			if (new java.lang.Object().equals(new java.lang.Object())) {
				for (int iAb = 0; iAb < 1; iAb++) {
					io.reactivex.subscribers.TestSubscriber<Object> local_var_5_0 = new io.reactivex.subscribers.TestSubscriber();
					local_var_5_0.onNext(new java.lang.Object());

					local_var_5_0.onError(new java.lang.Throwable());

					io.reactivex.observers.TestObserver<Object> local_var_5_1 = new io.reactivex.observers.TestObserver();
					local_var_5_1.cancel();

					io.reactivex.subscribers.TestSubscriber<Object> local_var_5_2 = new io.reactivex.subscribers.TestSubscriber();
					local_var_5_2.onComplete();

				}
			}
		} else {
			io.reactivex.subscribers.TestSubscriber<Object> local_var_3_0 = new io.reactivex.subscribers.TestSubscriber();
			local_var_3_0.request(113106928l);

		}
		io.reactivex.subscribers.TestSubscriber<Object> local_var_2_2 = new io.reactivex.subscribers.TestSubscriber();
		local_var_2_2.cancel();

	}

	public void method2(
		com.android.example.module07_module39_module2_module1.ClassAAI param0,
		com.android.example.module07_module39_module2_module5.ClassAAB param1,
		com.android.example.module07_module39_module2_module1.ClassAAD param2,
		com.android.example.module07_module39_module2_module1.ClassAAB param3) throws Throwable {
		io.reactivex.internal.disposables.ListCompositeDisposable local_var_2_4 = new io.reactivex.internal.disposables.ListCompositeDisposable();
		local_var_2_4.clear();

		io.reactivex.subscribers.TestSubscriber<Object> local_var_2_5 = new io.reactivex.subscribers.TestSubscriber();
		local_var_2_5.assertSubscribed();

		io.reactivex.subscribers.TestSubscriber<Object> local_var_2_6 = new io.reactivex.subscribers.TestSubscriber();
		local_var_2_6.onError(new java.lang.Throwable());

		param0.method2(new com.android.example.module07_module39_module2_module5.ClassAAF(), new com.android.example.module07_module39_module2_module5.ClassAAI());

	}

	public void method3(
		com.android.example.module07_module39_module2_module5.ClassAAF param0) throws Throwable {
		io.reactivex.subscribers.TestSubscriber<Object> local_var_2_1 = new io.reactivex.subscribers.TestSubscriber();
		local_var_2_1.onError(new java.lang.Throwable());

	}

	public void method4(
		com.android.example.module07_module39_module2_module5.ClassAAB param0,
		com.android.example.module07_module39_module2_module1.ClassAAI param1,
		com.android.example.module07_module39_module2_module5.ClassAAJ param2) throws Throwable {
		param0.method1(new io.reactivex.internal.schedulers.IoScheduler(), new io.reactivex.subscribers.TestSubscriber());

		io.reactivex.subscribers.TestSubscriber<Object> local_var_2_3 = new io.reactivex.subscribers.TestSubscriber();
		local_var_2_3.isCancelled();

	}
}
