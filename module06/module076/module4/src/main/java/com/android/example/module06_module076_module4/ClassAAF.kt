package com.android.example.module06_module076_module4

@Suppress("UNUSED_PARAMETER")
class ClassAAF {
	private 	val instance_var_1_0: com.android.example.module06_module076_module1.ClassAAC = com.android.example.module06_module076_module1.ClassAAC()
	private 	val instance_var_1_1: com.android.example.module06_module076_module5.ClassAAB = com.android.example.module06_module076_module5.ClassAAB()
	private 	val instance_var_1_2: com.android.example.module06_module076_module5.ClassAAI = com.android.example.module06_module076_module5.ClassAAI()

	fun method0(
		param0: com.android.example.module06_module076_module5.ClassAAD,
		param1: com.android.example.module06_module076_module5.ClassAAG,
		param2: com.android.example.module06_module076_module5.ClassAAG,
		param3: com.android.example.module06_module076_module5.ClassAAJ
	) {
		param0.method2("SomeString", "SomeString")

	}

	fun method1(
		param0: com.android.example.module06_module076_module1.ClassAAI,
		param1: com.android.example.module06_module076_module1.ClassAAE
	) {
		for (iAb in 0..4) {
			listOf("1", "2", "3").forEach {
				val local_var_4_0: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
				local_var_4_0.assertNotSubscribed()

				val local_var_4_1: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
				local_var_4_1.isCancelled()

			}
			val local_var_3_0: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
			local_var_3_0.requestMore(436063672544150514)

			local_var_3_0.assertNotSubscribed()

			val local_var_3_1: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
			local_var_3_1.hasSubscription()

		}
	}
}
