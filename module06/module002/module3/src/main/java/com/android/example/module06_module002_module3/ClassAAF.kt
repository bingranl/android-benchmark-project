package com.android.example.module06_module002_module3

@Suppress("UNUSED_PARAMETER")
class ClassAAF {
	private 	val instance_var_1_0: com.android.example.module06_module002_module2.ClassAAH = com.android.example.module06_module002_module2.ClassAAH()
	private 	val instance_var_1_1: com.android.example.module06_module002_module5.ClassAAB = com.android.example.module06_module002_module5.ClassAAB()

	fun method0(
		param0: com.android.example.module06_module002_module2.ClassAAI
	) {
	}

	fun method1(
		param0: com.android.example.module06_module002_module2.ClassAAA,
		param1: com.android.example.module06_module002_module5.ClassAAG,
		param2: com.android.example.module06_module002_module2.ClassAAE
	) {
		listOf("1", "2", "3").forEach {
			for (iAb in 0..3) {
				val local_var_4_0: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
				local_var_4_0.onComplete()

				val local_var_4_1: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
				local_var_4_1.cancel()

				local_var_4_0.request(1110091913389291093)

			}
			param0.method2(com.android.example.module06_module002_module5.ClassAAD(), com.android.example.module06_module002_module5.ClassAAB(), com.android.example.module06_module002_module5.ClassAAA(), com.android.example.module06_module002_module5.ClassAAJ())

		}
		val local_var_2_3: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_3.assertSubscribed()

	}

	fun method2(
		param0: com.android.example.module06_module002_module2.ClassAAE
	) {
		param0.method0(com.android.example.module06_module002_module5.ClassAAC(), com.android.example.module06_module002_module5.ClassAAD())

	}

	fun method3(
		param0: com.android.example.module06_module002_module5.ClassAAJ,
		param1: com.android.example.module06_module002_module2.ClassAAJ,
		param2: com.android.example.module06_module002_module5.ClassAAB
	) {
		val local_var_2_3: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_3.isCancelled()

	}

	fun method4(
		param0: com.android.example.module06_module002_module2.ClassAAE,
		param1: com.android.example.module06_module002_module5.ClassAAG
	) {
	}
}
