package com.android.example.module06_module353_module3

@Suppress("UNUSED_PARAMETER")
class ClassAAF {
	private 	val instance_var_1_0: com.android.example.module06_module353_module2.ClassAAF = com.android.example.module06_module353_module2.ClassAAF()
	private 	val instance_var_1_1: com.android.example.module06_module353_module2.ClassAAC = com.android.example.module06_module353_module2.ClassAAC()

	fun method0(
		param0: com.android.example.module06_module353_module2.ClassAAD,
		param1: io.reactivex.subscribers.TestSubscriber<kotlin.Any>,
		param2: io.reactivex.subscribers.TestSubscriber<kotlin.Any>
	) {
		for (iAb in 0..3) {
			listOf("1", "2", "3").forEach {
				val local_var_4_0: com.android.example.module06_module353_module2.ClassAAB = com.android.example.module06_module353_module2.ClassAAB()
				local_var_4_0.method0("SomeString", "SomeString", "SomeString", "SomeString")

			}
			val local_var_3_0: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
			local_var_3_0.isCancelled()

		}
		val local_var_2_3: io.reactivex.schedulers.TestScheduler = io.reactivex.schedulers.TestScheduler()
		local_var_2_3.triggerActions()

		val local_var_2_4: io.reactivex.observers.TestObserver<kotlin.Any> = io.reactivex.observers.TestObserver()
		local_var_2_4.onSuccess(kotlin.Any())

	}

	fun method1(
		param0: rx.observers.TestSubscriber<kotlin.Any>,
		param1: io.reactivex.subscribers.TestSubscriber<kotlin.Any>,
		param2: rx.observers.TestSubscriber<kotlin.Any>,
		param3: io.reactivex.subscribers.TestSubscriber<kotlin.Any>
	) {
	}

	fun method2(
		param0: rx.observers.TestSubscriber<kotlin.Any>
	) {
		val local_var_2_1: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_1.cancel()

		val local_var_2_2: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_2.hasSubscription()

	}
}
