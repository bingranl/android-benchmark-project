package com.android.example.module07_module18_module2

@Suppress("UNUSED_PARAMETER")
class ClassAAJ {
	private 	val instance_var_1_0: com.android.example.module07_module18_module1.ClassAAJ = com.android.example.module07_module18_module1.ClassAAJ()
	private 	val instance_var_1_1: com.android.example.module07_module18_module1.ClassAAJ = com.android.example.module07_module18_module1.ClassAAJ()
	private 	val instance_var_1_2: com.android.example.module07_module18_module3.ClassAAD = com.android.example.module07_module18_module3.ClassAAD()
	private 	val instance_var_1_3: com.android.example.module07_module18_module3.ClassAAF = com.android.example.module07_module18_module3.ClassAAF()

	fun method0(
		param0: com.android.example.module07_module18_module1.ClassAAD
	) {
		val local_var_2_1: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_1.cancel()

		for (iAb in 0..5) {
			for (iAc in 0..5) {
				val local_var_4_0: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
				local_var_4_0.onError(kotlin.Throwable())

				local_var_4_0.assertSubscribed()

				local_var_4_0.onComplete()

			}
		}
	}

	fun method1(
		param0: com.android.example.module07_module18_module1.ClassAAC,
		param1: com.android.example.module07_module18_module3.ClassAAI,
		param2: com.android.example.module07_module18_module1.ClassAAJ,
		param3: com.android.example.module07_module18_module3.ClassAAJ
	) {
		param0.method0(com.android.example.module07_module18_module3.ClassAAI(), com.android.example.module07_module18_module3.ClassAAG(), com.android.example.module07_module18_module3.ClassAAE(), com.android.example.module07_module18_module3.ClassAAH())

	}

	fun method2(
		param0: com.android.example.module07_module18_module3.ClassAAF,
		param1: com.android.example.module07_module18_module1.ClassAAF,
		param2: com.android.example.module07_module18_module1.ClassAAG,
		param3: com.android.example.module07_module18_module3.ClassAAH
	) {
	}

	fun method3(
		param0: com.android.example.module07_module18_module3.ClassAAI
	) {
		val local_var_2_1: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_1.onNext(kotlin.Any())

	}

	fun method4(
		param0: com.android.example.module07_module18_module1.ClassAAG,
		param1: com.android.example.module07_module18_module1.ClassAAI
	) {
		param0.method0(com.android.example.module07_module18_module3.ClassAAH(), com.android.example.module07_module18_module3.ClassAAH(), com.android.example.module07_module18_module3.ClassAAA(), com.android.example.module07_module18_module3.ClassAAG())

		val local_var_2_2: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_2.cancel()

	}
}
