package com.android.example.module01_module04

@Suppress("UNUSED_PARAMETER")
class ClassAAG {
	private 	val instance_var_1_0: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
	private 	val instance_var_1_1: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()

	fun method0(
		param0: io.reactivex.schedulers.TestScheduler
	) {
	}

	fun method1(
		param0: io.reactivex.disposables.SerialDisposable
	) {
		param0.dispose()

	}

	fun method2(
		param0: io.reactivex.subscribers.TestSubscriber<kotlin.Any>,
		param1: io.reactivex.subscribers.TestSubscriber<kotlin.Any>
	) {
		listOf("1", "2", "3").forEach {
			val local_var_3_0: com.android.example.module06_module109_module1.ClassAAJ = com.android.example.module06_module109_module1.ClassAAJ()
			local_var_3_0.method1("SomeString", "SomeString", "SomeString", "SomeString")

		}
		param0.hasSubscription()

	}
}
