package com.android.example.module06_module076_module4

@Suppress("UNUSED_PARAMETER")
class ClassAAI {
	private 	val instance_var_1_0: com.android.example.module06_module076_module5.ClassAAB = com.android.example.module06_module076_module5.ClassAAB()
	private 	val instance_var_1_1: com.android.example.module06_module076_module1.ClassAAB = com.android.example.module06_module076_module1.ClassAAB()
	private 	val instance_var_1_2: com.android.example.module06_module076_module1.ClassAAF = com.android.example.module06_module076_module1.ClassAAF()
	private 	val instance_var_1_3: com.android.example.module06_module076_module5.ClassAAF = com.android.example.module06_module076_module5.ClassAAF()
	private 	val instance_var_1_4: com.android.example.module06_module076_module5.ClassAAF = com.android.example.module06_module076_module5.ClassAAF()

	fun method0(
		param0: com.android.example.module06_module076_module5.ClassAAD,
		param1: com.android.example.module06_module076_module5.ClassAAI
	) {
		val local_var_2_2: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_2.dispose()

		val local_var_2_3: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_3.hasSubscription()

	}

	fun method1(
		param0: com.android.example.module06_module076_module1.ClassAAE
	) {
		if (kotlin.Any().equals(kotlin.Any())) {
			val local_var_3_0: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
			local_var_3_0.isCancelled()

		} else {
			val local_var_3_0: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
			local_var_3_0.dispose()

		}
		param0.method3(com.android.example.module06_module076_module5.ClassAAJ())

		val local_var_2_1: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_1.onComplete()

		val local_var_2_2: io.reactivex.schedulers.TestScheduler = io.reactivex.schedulers.TestScheduler()
		local_var_2_2.triggerActions()

	}
}
