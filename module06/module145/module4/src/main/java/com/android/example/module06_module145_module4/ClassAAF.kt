package com.android.example.module06_module145_module4

@Suppress("UNUSED_PARAMETER")
class ClassAAF {
	private 	val instance_var_1_0: com.android.example.module06_module145_module3.ClassAAG = com.android.example.module06_module145_module3.ClassAAG()
	private 	val instance_var_1_1: com.android.example.module06_module145_module3.ClassAAD = com.android.example.module06_module145_module3.ClassAAD()
	private 	val instance_var_1_2: com.android.example.module06_module145_module3.ClassAAJ = com.android.example.module06_module145_module3.ClassAAJ()
	private 	val instance_var_1_3: com.android.example.module06_module145_module6.ClassAAD = com.android.example.module06_module145_module6.ClassAAD()

	fun method0(
		param0: com.android.example.module06_module145_module3.ClassAAI,
		param1: com.android.example.module06_module145_module6.ClassAAG
	) {
		val local_var_2_2: io.reactivex.internal.util.LinkedArrayList = io.reactivex.internal.util.LinkedArrayList(85)
		local_var_2_2.toString()

		val local_var_2_3: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_3.assertNotSubscribed()

	}

	fun method1(
		param0: com.android.example.module06_module145_module6.ClassAAI,
		param1: com.android.example.module06_module145_module6.ClassAAD
	) {
		for (iAb in 0..1) {
			val local_var_3_0: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
			local_var_3_0.cancel()

			local_var_3_0.onNext(kotlin.Any())

		}
		val local_var_2_2: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_2.isDisposed()

	}

	fun method2(
		param0: com.android.example.module06_module145_module6.ClassAAD,
		param1: com.android.example.module06_module145_module3.ClassAAH
	) {
		val local_var_2_2: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_2.cancel()

	}

	fun method3(
		param0: com.android.example.module06_module145_module3.ClassAAC,
		param1: com.android.example.module06_module145_module6.ClassAAJ,
		param2: com.android.example.module06_module145_module3.ClassAAG
	) {
		param0.method2(com.android.example.module06_module145_module6.ClassAAJ())

		val local_var_2_3: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_3.onComplete()

		val local_var_2_4: io.reactivex.internal.util.LinkedArrayList = io.reactivex.internal.util.LinkedArrayList(59)
		local_var_2_4.toString()

		val local_var_2_5: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_5.isDisposed()

	}
}
