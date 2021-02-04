package com.android.example.module06_module025_module1;

public class ClassAAF {
	private 	com.android.example.module06_module109_module1.ClassAAH instance_var_1_0 = new com.android.example.module06_module109_module1.ClassAAH();
	private 	com.android.example.module06_module025_module2.ClassAAJ instance_var_1_1 = new com.android.example.module06_module025_module2.ClassAAJ();
	private 	com.android.example.module06_module025_module2.ClassAAB instance_var_1_2 = new com.android.example.module06_module025_module2.ClassAAB();

	public void method0(
		com.android.example.module06_module109_module1.ClassAAJ param0) throws Throwable {
		java.util.Collections.emptyList().forEach( lambda0 -> {
			try {
				param0.method0("SomeString", "SomeString");

				if (new java.lang.Object().equals(new java.lang.Object())) {
					io.reactivex.subscribers.TestSubscriber<Object> local_var_4_0 = new io.reactivex.subscribers.TestSubscriber();
					local_var_4_0.assertSubscribed();

				} else {
					io.reactivex.subscribers.TestSubscriber<Object> local_var_4_0 = new io.reactivex.subscribers.TestSubscriber();
					local_var_4_0.hasSubscription();

				}
			} catch(Throwable e) { } // ignore
		});
		io.reactivex.subscribers.TestSubscriber<Object> local_var_2_1 = new io.reactivex.subscribers.TestSubscriber();
		local_var_2_1.requestMore(-610323327l);

		io.reactivex.internal.disposables.ListCompositeDisposable local_var_2_2 = new io.reactivex.internal.disposables.ListCompositeDisposable();
		local_var_2_2.dispose();

	}

	public void method1(
		com.android.example.module06_module025_module2.ClassAAF param0,
		com.android.example.module06_module025_module2.ClassAAJ param1,
		com.android.example.module06_module025_module2.ClassAAD param2,
		com.android.example.module06_module025_module2.ClassAAF param3) throws Throwable {
		param0.method3(new io.reactivex.subscribers.TestSubscriber());

		io.reactivex.subscribers.TestSubscriber<Object> local_var_2_4 = new io.reactivex.subscribers.TestSubscriber();
		local_var_2_4.onComplete();

		io.reactivex.subscribers.TestSubscriber<Object> local_var_2_5 = new io.reactivex.subscribers.TestSubscriber();
		local_var_2_5.assertSubscribed();

		param0.method2(new io.reactivex.subscribers.TestSubscriber(), new io.reactivex.subscribers.TestSubscriber());

	}
}
