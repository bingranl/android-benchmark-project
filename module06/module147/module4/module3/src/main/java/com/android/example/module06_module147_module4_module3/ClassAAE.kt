package com.android.example.module06_module147_module4_module3

@Suppress("UNUSED_PARAMETER")
class ClassAAE {
	private 	val instance_var_1_0: com.android.example.module06_module147_module4_module6.ClassAAC = com.android.example.module06_module147_module4_module6.ClassAAC()
	private 	val instance_var_1_1: com.android.example.module06_module147_module4_module6.ClassAAA = com.android.example.module06_module147_module4_module6.ClassAAA()
	private 	val instance_var_1_2: com.android.example.module06_module147_module4_module6.ClassAAJ = com.android.example.module06_module147_module4_module6.ClassAAJ()
	private 	val instance_var_1_3: com.android.example.module06_module147_module4_module6.ClassAAF = com.android.example.module06_module147_module4_module6.ClassAAF()
	private 	val instance_var_1_4: com.android.example.module06_module147_module4_module6.ClassAAI = com.android.example.module06_module147_module4_module6.ClassAAI()

	fun method0(
		param0: com.android.example.module06_module147_module4_module6.ClassAAE,
		param1: com.android.example.module06_module147_module4_module6.ClassAAI
	) {
		listOf("1", "2", "3").forEach {
			for (iAb in 0..2) {
				for (iAc in 0..0) {
					val local_var_5_0: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
					local_var_5_0.dispose()

					local_var_5_0.onError(kotlin.Throwable())

					val local_var_5_1: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
					local_var_5_1.cancel()

				}
				val local_var_4_0: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
				local_var_4_0.requestMore(-7169216731733140590)

			}
		}
		val local_var_2_2: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_2.isCancelled()

		val local_var_2_3: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_3.cancel()

		val local_var_2_4: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_4.assertNotSubscribed()

	}

	fun method1(
		param0: com.android.example.module06_module147_module4_module6.ClassAAI,
		param1: com.android.example.module06_module147_module4_module6.ClassAAE,
		param2: com.android.example.module06_module147_module4_module6.ClassAAA,
		param3: com.android.example.module06_module147_module4_module6.ClassAAE
	) {
		val local_var_2_4: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_4.assertSubscribed()

	}

	fun method2(
		param0: com.android.example.module06_module147_module4_module6.ClassAAI,
		param1: com.android.example.module06_module147_module4_module6.ClassAAD
	) {
		val local_var_2_2: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_2.requestMore(3007330065766186015)

		param0.method0(io.reactivex.subscribers.TestSubscriber(), io.reactivex.subscribers.TestSubscriber(), io.reactivex.subscribers.TestSubscriber())

		param0.method1(io.reactivex.subscribers.TestSubscriber(), io.reactivex.subscribers.TestSubscriber())

		val local_var_2_3: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_3.onNext(kotlin.Any())

	}

	fun method3(
		param0: com.android.example.module06_module147_module4_module6.ClassAAG
	) {
		val local_var_2_1: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_1.hasSubscription()

	}
}
