package com.android.example.module06_module353_module3

@Suppress("UNUSED_PARAMETER")
class ClassAAC {
	private 	val instance_var_1_0: rx.observers.TestSubscriber<kotlin.Any> = rx.observers.TestSubscriber()
	private 	val instance_var_1_1: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()

	fun method0(
		param0: com.android.example.module06_module353_module2.ClassAAH,
		param1: io.reactivex.subscribers.TestSubscriber<kotlin.Any>,
		param2: io.reactivex.subscribers.TestSubscriber<kotlin.Any>,
		param3: rx.observers.TestSubscriber<kotlin.Any>
	) {
		val local_var_2_4: com.android.example.module06_module353_module2.ClassAAF = com.android.example.module06_module353_module2.ClassAAF()
		local_var_2_4.method1("SomeString")

		if (kotlin.Any().equals(kotlin.Any())) {
			val local_var_3_0: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
			local_var_3_0.cancel()

		} else {
			val local_var_3_0: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
			local_var_3_0.isDisposed()

		}
		param0.method0("SomeString", "SomeString", "SomeString")

	}

	fun method1(
		param0: io.reactivex.subscribers.TestSubscriber<kotlin.Any>,
		param1: io.reactivex.internal.util.LinkedArrayList
	) {
	}

	fun method2(
		param0: com.android.example.module06_module353_module2.ClassAAA,
		param1: com.android.example.module06_module353_module2.ClassAAE,
		param2: io.reactivex.subscribers.TestSubscriber<kotlin.Any>,
		param3: io.reactivex.subscribers.TestSubscriber<kotlin.Any>
	) {
		val local_var_2_4: rx.observers.TestSubscriber<kotlin.Any> = rx.observers.TestSubscriber()
		local_var_2_4.onError(kotlin.Throwable())

		val local_var_2_5: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_5.isDisposed()

		val local_var_2_6: com.android.example.module06_module353_module2.ClassAAH = com.android.example.module06_module353_module2.ClassAAH()
		local_var_2_6.method1("SomeString", "SomeString", "SomeString")

		param0.method0("SomeString", "SomeString", "SomeString", "SomeString")

	}

	fun method3(
		param0: io.reactivex.subscribers.TestSubscriber<kotlin.Any>
	) {
		val local_var_2_1: com.android.example.module06_module353_module2.ClassAAD = com.android.example.module06_module353_module2.ClassAAD()
		local_var_2_1.method2("SomeString", "SomeString", "SomeString", "SomeString")

		val local_var_2_2: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_2.hasSubscription()

		val local_var_2_3: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_3.onError(kotlin.Throwable())

		val local_var_2_4: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_4.assertNotSubscribed()

	}
}
