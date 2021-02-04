package com.android.example.module07_module21_module02_module1_module2

@Suppress("UNUSED_PARAMETER")
class ClassAAC {
	private 	val instance_var_1_0: com.android.example.module07_module21_module02_module1_module1.ClassAAC = com.android.example.module07_module21_module02_module1_module1.ClassAAC()
	private 	val instance_var_1_1: com.android.example.module07_module21_module02_module1_module5.ClassAAF = com.android.example.module07_module21_module02_module1_module5.ClassAAF()
	private 	val instance_var_1_2: com.android.example.module07_module21_module02_module1_module5.ClassAAE = com.android.example.module07_module21_module02_module1_module5.ClassAAE()
	private 	val instance_var_1_3: com.android.example.module07_module21_module02_module1_module1.ClassAAH = com.android.example.module07_module21_module02_module1_module1.ClassAAH()
	private 	val instance_var_1_4: com.android.example.module07_module21_module02_module1_module5.ClassAAC = com.android.example.module07_module21_module02_module1_module5.ClassAAC()

	fun method0(
		param0: com.android.example.module07_module21_module02_module1_module5.ClassAAG,
		param1: com.android.example.module07_module21_module02_module1_module1.ClassAAI,
		param2: com.android.example.module07_module21_module02_module1_module5.ClassAAH
	) {
		listOf("1", "2", "3").forEach {
			for (iAb in 0..4) {
				listOf("1", "2", "3").forEach {
					val local_var_5_0: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
					local_var_5_0.hasSubscription()

					val local_var_5_1: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
					local_var_5_1.isDisposed()

				}
				param0.method1(io.reactivex.subscribers.TestSubscriber())

			}
			param0.method2(io.reactivex.subscribers.TestSubscriber())

		}
		val local_var_2_3: io.reactivex.internal.disposables.ListCompositeDisposable = io.reactivex.internal.disposables.ListCompositeDisposable()
		local_var_2_3.dispose()

		val local_var_2_4: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_4.assertNotSubscribed()

	}

	fun method1(
		param0: com.android.example.module07_module21_module02_module1_module1.ClassAAH,
		param1: com.android.example.module07_module21_module02_module1_module5.ClassAAB
	) {
		val local_var_2_2: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_2.request(-6517172448024688690)

		val local_var_2_3: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_3.isCancelled()

		val local_var_2_4: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_4.hasSubscription()

	}

	fun method2(
		param0: com.android.example.module07_module21_module02_module1_module1.ClassAAD,
		param1: com.android.example.module07_module21_module02_module1_module1.ClassAAJ
	) {
		val local_var_2_2: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_2.request(7446938230953596375)

		param0.method1(com.android.example.module07_module21_module02_module1_module5.ClassAAD())

	}

	fun method3(
		param0: com.android.example.module07_module21_module02_module1_module1.ClassAAI
	) {
	}

	fun method4(
		param0: com.android.example.module07_module21_module02_module1_module5.ClassAAE
	) {
		val local_var_2_1: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_1.isCancelled()

		val local_var_2_2: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_2.dispose()

		val local_var_2_3: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_3.request(-937736632568757985)

	}
}
