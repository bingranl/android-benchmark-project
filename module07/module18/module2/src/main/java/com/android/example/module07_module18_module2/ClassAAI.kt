package com.android.example.module07_module18_module2

@Suppress("UNUSED_PARAMETER")
class ClassAAI {
	private 	val instance_var_1_0: com.android.example.module07_module18_module3.ClassAAB = com.android.example.module07_module18_module3.ClassAAB()
	private 	val instance_var_1_1: com.android.example.module07_module18_module3.ClassAAI = com.android.example.module07_module18_module3.ClassAAI()

	fun method0(
		param0: com.android.example.module07_module18_module3.ClassAAC,
		param1: com.android.example.module07_module18_module3.ClassAAI,
		param2: com.android.example.module07_module18_module3.ClassAAI
	) {
		val local_var_2_3: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_3.assertSubscribed()

		for (iAb in 0..5) {
			listOf("1", "2", "3").forEach {
				val local_var_4_0: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
				local_var_4_0.onComplete()

				val local_var_4_1: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
				local_var_4_1.isCancelled()

			}
			param0.method2(io.reactivex.subscribers.TestSubscriber())

		}
		val local_var_2_4: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_4.isDisposed()

	}

	fun method1(
		param0: com.android.example.module07_module18_module3.ClassAAB
	) {
		val local_var_2_1: io.reactivex.schedulers.TestScheduler = io.reactivex.schedulers.TestScheduler()
		local_var_2_1.triggerActions()

		val local_var_2_2: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_2.onComplete()

		val local_var_2_3: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_3.request(1036696275580934034)

	}
}
