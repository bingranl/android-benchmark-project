package com.android.example.module06_module353_module3

@Suppress("UNUSED_PARAMETER")
class ClassAAG {
	private 	val instance_var_1_0: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
	private 	val instance_var_1_1: com.android.example.module06_module353_module2.ClassAAE = com.android.example.module06_module353_module2.ClassAAE()

	fun method0(
		param0: io.reactivex.subscribers.TestSubscriber<kotlin.Any>,
		param1: io.reactivex.subscribers.TestSubscriber<kotlin.Any>,
		param2: io.reactivex.internal.disposables.ListCompositeDisposable
	) {
		param0.assertNotSubscribed()

	}

	fun method1(
		param0: rx.observers.TestSubscriber<kotlin.Any>,
		param1: io.reactivex.subscribers.TestSubscriber<kotlin.Any>,
		param2: io.reactivex.subscribers.TestSubscriber<kotlin.Any>
	) {
	}

	fun method2(
		param0: rx.observers.TestSubscriber<kotlin.Any>,
		param1: io.reactivex.disposables.SerialDisposable,
		param2: com.android.example.module06_module353_module2.ClassAAA
	) {
	}

	fun method3(
		param0: com.android.example.module06_module353_module2.ClassAAE
	) {
		param0.method0("SomeString", "SomeString", "SomeString")

		listOf("1", "2", "3").forEach {
			val local_var_3_0: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
			local_var_3_0.assertSubscribed()

		}
		param0.method1("SomeString")

		val local_var_2_1: rx.observers.TestSubscriber<kotlin.Any> = rx.observers.TestSubscriber()
		local_var_2_1.getCompletions()

	}
}
