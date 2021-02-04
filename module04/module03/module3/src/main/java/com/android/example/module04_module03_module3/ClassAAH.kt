package com.android.example.module04_module03_module3

@Suppress("UNUSED_PARAMETER")
class ClassAAH {
	private 	val instance_var_1_0: com.android.example.module04_module12_module6.ClassAAG = com.android.example.module04_module12_module6.ClassAAG()
	private 	val instance_var_1_1: com.android.example.module04_module12_module6.ClassAAA = com.android.example.module04_module12_module6.ClassAAA()
	private 	val instance_var_1_2: com.android.example.module04_module12_module6.ClassAAB = com.android.example.module04_module12_module6.ClassAAB()
	private 	val instance_var_1_3: com.android.example.module04_module12_module6.ClassAAG = com.android.example.module04_module12_module6.ClassAAG()
	private 	val instance_var_1_4: com.android.example.module04_module12_module6.ClassAAJ = com.android.example.module04_module12_module6.ClassAAJ()

	fun method0(
		param0: com.android.example.module04_module12_module6.ClassAAF
	) {
		val local_var_2_1: io.reactivex.schedulers.TestScheduler = io.reactivex.schedulers.TestScheduler()
		local_var_2_1.triggerActions()

		val local_var_2_2: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_2.assertNotSubscribed()

	}

	fun method1(
		param0: com.android.example.module04_module12_module6.ClassAAE
	) {
		if (kotlin.Any().equals(kotlin.Any())) {
			val local_var_3_0: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
			local_var_3_0.isDisposed()

		} else {
			val local_var_3_0: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
			local_var_3_0.onError(kotlin.Throwable())

		}
		val local_var_2_1: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_1.isCancelled()

		param0.method2("SomeString", "SomeString")

	}

	fun method2(
		param0: com.android.example.module04_module12_module6.ClassAAE,
		param1: com.android.example.module04_module12_module6.ClassAAA,
		param2: com.android.example.module04_module12_module6.ClassAAD
	) {
		param0.method3("SomeString", "SomeString")

	}

	fun method3(
		param0: com.android.example.module04_module12_module6.ClassAAG,
		param1: com.android.example.module04_module12_module6.ClassAAA,
		param2: com.android.example.module04_module12_module6.ClassAAB,
		param3: com.android.example.module04_module12_module6.ClassAAF
	) {
		val local_var_2_4: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_4.request(6709289409981277405)

		val local_var_2_5: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_5.onComplete()

	}

	fun method4(
		param0: com.android.example.module04_module12_module6.ClassAAA,
		param1: com.android.example.module04_module12_module6.ClassAAI,
		param2: com.android.example.module04_module12_module6.ClassAAH
	) {
		val local_var_2_3: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_3.onComplete()

		val local_var_2_4: io.reactivex.internal.disposables.ListCompositeDisposable = io.reactivex.internal.disposables.ListCompositeDisposable()
		local_var_2_4.dispose()

		param0.method3("SomeString", "SomeString", "SomeString")

		val local_var_2_5: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_5.assertSubscribed()

	}
}
