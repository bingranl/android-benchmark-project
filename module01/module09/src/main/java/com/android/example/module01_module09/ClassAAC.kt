package com.android.example.module01_module09

@Suppress("UNUSED_PARAMETER")
class ClassAAC {
	private 	val instance_var_1_0: com.android.example.module06_module121_module3.ClassAAI = com.android.example.module06_module121_module3.ClassAAI()
	private 	val instance_var_1_1: com.android.example.module06_module121_module3.ClassAAB = com.android.example.module06_module121_module3.ClassAAB()
	private 	val instance_var_1_2: com.android.example.module06_module121_module3.ClassAAJ = com.android.example.module06_module121_module3.ClassAAJ()
	private 	val instance_var_1_3: com.android.example.module06_module121_module3.ClassAAE = com.android.example.module06_module121_module3.ClassAAE()
	private 	val instance_var_1_4: com.android.example.module06_module121_module3.ClassAAD = com.android.example.module06_module121_module3.ClassAAD()

	fun method0(
		param0: com.android.example.module06_module121_module3.ClassAAB,
		param1: com.android.example.module06_module121_module3.ClassAAB
	) {
		for (iAb in 0..2) {
			val local_var_3_0: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
			local_var_3_0.request(-2625625331662904813)

			listOf("1", "2", "3").forEach {
				val local_var_4_0: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
				local_var_4_0.assertNotSubscribed()

				val local_var_4_1: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
				local_var_4_1.hasSubscription()

			}
		}
		val local_var_2_2: io.reactivex.schedulers.TestScheduler = io.reactivex.schedulers.TestScheduler()
		local_var_2_2.triggerActions()

		val local_var_2_3: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_3.request(993561132338090097)

	}

	fun method1(
		param0: com.android.example.module06_module121_module3.ClassAAG,
		param1: com.android.example.module06_module121_module3.ClassAAH,
		param2: com.android.example.module06_module121_module3.ClassAAE
	) {
	}

	fun method2(
		param0: com.android.example.module06_module121_module3.ClassAAH,
		param1: com.android.example.module06_module121_module3.ClassAAB,
		param2: com.android.example.module06_module121_module3.ClassAAC,
		param3: com.android.example.module06_module121_module3.ClassAAB
	) {
	}
}
