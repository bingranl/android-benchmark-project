package com.android.example.module06_module147_module4_module3

@Suppress("UNUSED_PARAMETER")
class ClassAAI {
	private 	val instance_var_1_0: com.android.example.module06_module147_module4_module6.ClassAAA = com.android.example.module06_module147_module4_module6.ClassAAA()
	private 	val instance_var_1_1: com.android.example.module06_module147_module4_module6.ClassAAJ = com.android.example.module06_module147_module4_module6.ClassAAJ()

	fun method0(
		param0: com.android.example.module06_module147_module4_module6.ClassAAF,
		param1: com.android.example.module06_module147_module4_module6.ClassAAH
	) {
		for (iAb in 0..0) {
			for (iAc in 0..1) {
				listOf("1", "2", "3").forEach {
					val local_var_5_0: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
					local_var_5_0.assertNotSubscribed()

					val local_var_5_1: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
					local_var_5_1.cancel()

				}
				val local_var_4_0: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
				local_var_4_0.onError(kotlin.Throwable())

			}
			val local_var_3_0: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
			local_var_3_0.requestMore(3091534623118682579)

			local_var_3_0.onComplete()

			local_var_3_0.dispose()

		}
	}

	fun method1(
		param0: com.android.example.module06_module147_module4_module6.ClassAAE,
		param1: com.android.example.module06_module147_module4_module6.ClassAAC,
		param2: com.android.example.module06_module147_module4_module6.ClassAAE,
		param3: com.android.example.module06_module147_module4_module6.ClassAAG
	) {
		param0.method1(io.reactivex.subscribers.TestSubscriber(), io.reactivex.subscribers.TestSubscriber(), io.reactivex.subscribers.TestSubscriber(), io.reactivex.subscribers.TestSubscriber())

		val local_var_2_4: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_4.requestMore(-6773514762886581853)

	}

	fun method2(
		param0: com.android.example.module06_module147_module4_module6.ClassAAG,
		param1: com.android.example.module06_module147_module4_module6.ClassAAG,
		param2: com.android.example.module06_module147_module4_module6.ClassAAG
	) {
		val local_var_2_3: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_3.cancel()

		param0.method0(io.reactivex.internal.disposables.ListCompositeDisposable(), io.reactivex.observers.TestObserver(), io.reactivex.subscribers.TestSubscriber(), io.reactivex.subscribers.TestSubscriber())

	}

	fun method3(
		param0: com.android.example.module06_module147_module4_module6.ClassAAH,
		param1: com.android.example.module06_module147_module4_module6.ClassAAH,
		param2: com.android.example.module06_module147_module4_module6.ClassAAI
	) {
		param0.method0(io.reactivex.subscribers.TestSubscriber(), io.reactivex.subscribers.TestSubscriber())

		val local_var_2_3: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_3.requestMore(-4502374506853914941)

	}

	fun method4(
		param0: com.android.example.module06_module147_module4_module6.ClassAAJ
	) {
		param0.method0(io.reactivex.subscribers.TestSubscriber(), io.reactivex.schedulers.TestScheduler())

	}
}
