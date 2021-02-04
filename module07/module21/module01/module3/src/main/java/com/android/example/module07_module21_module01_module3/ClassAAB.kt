package com.android.example.module07_module21_module01_module3

@Suppress("UNUSED_PARAMETER")
class ClassAAB {
	private 	val instance_var_1_0: com.android.example.module07_module21_module01_module2.ClassAAI = com.android.example.module07_module21_module01_module2.ClassAAI()
	private 	val instance_var_1_1: com.android.example.module07_module21_module01_module5.ClassAAI = com.android.example.module07_module21_module01_module5.ClassAAI()

	fun method0(
		param0: com.android.example.module07_module21_module01_module5.ClassAAA
	) {
		for (iAb in 0..3) {
			val local_var_3_0: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
			local_var_3_0.isDisposed()

			local_var_3_0.requestMore(-5801239106129165204)

			val local_var_3_1: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
			local_var_3_1.assertNotSubscribed()

		}
	}

	fun method1(
		param0: com.android.example.module07_module21_module01_module5.ClassAAB,
		param1: com.android.example.module07_module21_module01_module2.ClassAAC,
		param2: com.android.example.module07_module21_module01_module5.ClassAAD
	) {
		val local_var_2_3: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_3.requestMore(-70337263225939753)

		param0.method4(io.reactivex.internal.schedulers.IoScheduler(), io.reactivex.subscribers.TestSubscriber())

	}
}
