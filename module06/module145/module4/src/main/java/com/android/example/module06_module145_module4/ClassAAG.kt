package com.android.example.module06_module145_module4

@Suppress("UNUSED_PARAMETER")
class ClassAAG {
	private 	val instance_var_1_0: com.android.example.module06_module145_module3.ClassAAD = com.android.example.module06_module145_module3.ClassAAD()
	private 	val instance_var_1_1: com.android.example.module06_module145_module3.ClassAAA = com.android.example.module06_module145_module3.ClassAAA()

	fun method0(
		param0: com.android.example.module06_module145_module3.ClassAAE,
		param1: com.android.example.module06_module145_module3.ClassAAE
	) {
	}

	fun method1(
		param0: com.android.example.module06_module145_module3.ClassAAA,
		param1: com.android.example.module06_module145_module3.ClassAAA,
		param2: com.android.example.module06_module145_module3.ClassAAB,
		param3: com.android.example.module06_module145_module3.ClassAAC
	) {
		param0.method2(com.android.example.module06_module145_module6.ClassAAB(), com.android.example.module06_module145_module6.ClassAAH())

		if (kotlin.Any().equals(kotlin.Any())) {
			val local_var_3_0: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
			local_var_3_0.requestMore(3865959182328724715)

		}
		param0.method1(com.android.example.module06_module145_module6.ClassAAD(), com.android.example.module06_module145_module6.ClassAAE(), com.android.example.module06_module145_module6.ClassAAH(), com.android.example.module06_module145_module6.ClassAAA())

	}

	fun method2(
		param0: com.android.example.module06_module145_module3.ClassAAD,
		param1: com.android.example.module06_module145_module3.ClassAAC,
		param2: com.android.example.module06_module145_module3.ClassAAC
	) {
		val local_var_2_3: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_3.assertSubscribed()

		val local_var_2_4: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_4.onError(kotlin.Throwable())

		param0.method2(com.android.example.module06_module145_module6.ClassAAE(), com.android.example.module06_module145_module6.ClassAAH(), com.android.example.module06_module145_module6.ClassAAD(), com.android.example.module06_module145_module6.ClassAAJ())

		val local_var_2_5: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_5.assertNotSubscribed()

	}
}
