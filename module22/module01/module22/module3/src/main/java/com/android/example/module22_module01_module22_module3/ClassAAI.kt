package com.android.example.module22_module01_module22_module3

@Suppress("UNUSED_PARAMETER")
class ClassAAI {
	private 	val instance_var_1_0: com.android.example.module06_module257_module3.ClassAAG = com.android.example.module06_module257_module3.ClassAAG()
	private 	val instance_var_1_1: com.android.example.module06_module257_module3.ClassAAI = com.android.example.module06_module257_module3.ClassAAI()

	fun method0(
		param0: com.android.example.module06_module257_module3.ClassAAD
	) {
	}

	fun method1(
		param0: com.android.example.module06_module257_module3.ClassAAI
	) {
	}

	fun method2(
		param0: com.android.example.module06_module257_module3.ClassAAI,
		param1: com.android.example.module06_module257_module3.ClassAAJ
	) {
	}

	fun method3(
		param0: com.android.example.module06_module257_module3.ClassAAE,
		param1: com.android.example.module06_module257_module3.ClassAAE,
		param2: com.android.example.module06_module257_module3.ClassAAF
	) {
		listOf("1", "2", "3").forEach {
			for (iAb in 0..1) {
				for (iAc in 0..6) {
					val local_var_5_0: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
					local_var_5_0.isDisposed()

					val local_var_5_1: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
					local_var_5_1.onComplete()

					local_var_5_0.onComplete()

				}
				val local_var_4_0: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
				local_var_4_0.isCancelled()

			}
			val local_var_3_0: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
			local_var_3_0.assertSubscribed()

		}
	}
}
