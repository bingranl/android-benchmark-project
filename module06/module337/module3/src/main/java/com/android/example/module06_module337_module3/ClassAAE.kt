package com.android.example.module06_module337_module3

@Suppress("UNUSED_PARAMETER")
class ClassAAE {
	private 	val instance_var_1_0: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
	private 	val instance_var_1_1: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
	private 	val instance_var_1_2: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
	private 	val instance_var_1_3: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
	private 	val instance_var_1_4: io.reactivex.disposables.SerialDisposable = io.reactivex.disposables.SerialDisposable()

	fun method0(
		param0: io.reactivex.internal.disposables.ListCompositeDisposable
	) {
	}

	fun method1(
		param0: io.reactivex.subscribers.TestSubscriber<kotlin.Any>,
		param1: io.reactivex.schedulers.TestScheduler,
		param2: io.reactivex.subscribers.TestSubscriber<kotlin.Any>,
		param3: io.reactivex.subscribers.TestSubscriber<kotlin.Any>
	) {
	}

	fun method2(
		param0: io.reactivex.subscribers.TestSubscriber<kotlin.Any>,
		param1: io.reactivex.subscribers.TestSubscriber<kotlin.Any>,
		param2: io.reactivex.subscribers.TestSubscriber<kotlin.Any>
	) {
		if (kotlin.Any().equals(kotlin.Any())) {
			param0.assertNotSubscribed()

		} else {
			param0.assertSubscribed()

		}
		param0.onComplete()

		val local_var_2_3: com.android.example.module06_module321_module10.ClassAAG = com.android.example.module06_module321_module10.ClassAAG()
		local_var_2_3.method1("SomeString", "SomeString")

	}

	fun method3(
		param0: io.reactivex.internal.disposables.ListCompositeDisposable
	) {
		param0.isDisposed()

		val local_var_2_1: com.android.example.module06_module321_module10.ClassAAA = com.android.example.module06_module321_module10.ClassAAA()
		local_var_2_1.method0("SomeString", "SomeString")

		val local_var_2_2: com.android.example.module06_module321_module10.ClassAAJ = com.android.example.module06_module321_module10.ClassAAJ()
		local_var_2_2.method0("SomeString")

	}

	fun method4(
		param0: io.reactivex.subscribers.TestSubscriber<kotlin.Any>,
		param1: io.reactivex.subscribers.TestSubscriber<kotlin.Any>,
		param2: io.reactivex.subscribers.TestSubscriber<kotlin.Any>,
		param3: io.reactivex.subscribers.TestSubscriber<kotlin.Any>
	) {
		val local_var_2_4: com.android.example.module06_module342_module3.ClassAAG = com.android.example.module06_module342_module3.ClassAAG()
		local_var_2_4.method1("SomeString", "SomeString", "SomeString", "SomeString")

		param0.isCancelled()

	}
}
