package com.android.example.module06_module282_module1

@Suppress("UNUSED_PARAMETER")
class ClassAAI {
	private 	val instance_var_1_0: io.reactivex.internal.schedulers.SingleScheduler = io.reactivex.internal.schedulers.SingleScheduler()
	private 	val instance_var_1_1: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()

	fun method0(
		param0: io.reactivex.subscribers.TestSubscriber<kotlin.Any>,
		param1: io.reactivex.internal.disposables.ListCompositeDisposable,
		param2: com.android.example.module06_module342_module3.ClassAAB
	) {
		val local_var_2_3: com.android.example.module06_module342_module3.ClassAAC = com.android.example.module06_module342_module3.ClassAAC()
		local_var_2_3.method2("SomeString")

		param0.dispose()

		listOf("1", "2", "3").forEach {
			param0.dispose()

			val local_var_3_0: com.android.example.module06_module342_module3.ClassAAF = com.android.example.module06_module342_module3.ClassAAF()
			local_var_3_0.method0("SomeString", "SomeString")

		}
		val local_var_2_4: com.android.example.module06_module342_module3.ClassAAH = com.android.example.module06_module342_module3.ClassAAH()
		local_var_2_4.method3("SomeString", "SomeString")

	}

	fun method1(
		param0: io.reactivex.subscribers.TestSubscriber<kotlin.Any>,
		param1: com.android.example.module06_module342_module3.ClassAAF,
		param2: com.android.example.module06_module342_module3.ClassAAI
	) {
		val local_var_2_3: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_3.requestMore(-8047699456414398663)

		val local_var_2_4: com.android.example.module06_module342_module3.ClassAAE = com.android.example.module06_module342_module3.ClassAAE()
		local_var_2_4.method4("SomeString", "SomeString", "SomeString")

	}

	fun method2(
		param0: io.reactivex.subscribers.TestSubscriber<kotlin.Any>
	) {
		val local_var_2_1: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_1.request(4160038477905756075)

		param0.isCancelled()

	}

	fun method3(
		param0: io.reactivex.subscribers.TestSubscriber<kotlin.Any>
	) {
		val local_var_2_1: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_1.assertSubscribed()

		val local_var_2_2: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_2.isDisposed()

		val local_var_2_3: com.android.example.module06_module342_module3.ClassAAI = com.android.example.module06_module342_module3.ClassAAI()
		local_var_2_3.method1("SomeString", "SomeString", "SomeString")

	}
}
