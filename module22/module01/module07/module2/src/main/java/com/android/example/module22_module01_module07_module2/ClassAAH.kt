package com.android.example.module22_module01_module07_module2

@Suppress("UNUSED_PARAMETER")
class ClassAAH {
	private 	val instance_var_1_0: com.android.example.module22_module01_module07_module3.ClassAAE = com.android.example.module22_module01_module07_module3.ClassAAE()
	private 	val instance_var_1_1: com.android.example.module22_module01_module07_module1.ClassAAB = com.android.example.module22_module01_module07_module1.ClassAAB()
	private 	val instance_var_1_2: com.android.example.module22_module01_module07_module1.ClassAAI = com.android.example.module22_module01_module07_module1.ClassAAI()
	private 	val instance_var_1_3: com.android.example.module22_module01_module07_module1.ClassAAF = com.android.example.module22_module01_module07_module1.ClassAAF()

	fun method0(
		param0: com.android.example.module22_module01_module07_module1.ClassAAI,
		param1: com.android.example.module22_module01_module07_module1.ClassAAF
	) {
	}

	fun method1(
		param0: com.android.example.module22_module01_module07_module1.ClassAAC
	) {
		listOf("1", "2", "3").forEach {
			for (iAb in 0..2) {
				listOf("1", "2", "3").forEach {
					param0.method2(com.android.example.module22_module01_module07_module3.ClassAAF())

					val local_var_5_0: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
					local_var_5_0.onComplete()

				}
			}
		}
		val local_var_2_1: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_1.isDisposed()

	}

	fun method2(
		param0: com.android.example.module22_module01_module07_module1.ClassAAA,
		param1: com.android.example.module22_module01_module07_module1.ClassAAC
	) {
		param0.method0(com.android.example.module22_module01_module07_module3.ClassAAB(), com.android.example.module22_module01_module07_module3.ClassAAF())

		param0.method2(com.android.example.module22_module01_module07_module3.ClassAAG(), com.android.example.module22_module01_module07_module3.ClassAAJ(), com.android.example.module22_module01_module07_module3.ClassAAD())

		val local_var_2_2: io.reactivex.internal.disposables.ListCompositeDisposable = io.reactivex.internal.disposables.ListCompositeDisposable()
		local_var_2_2.clear()

		val local_var_2_3: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_3.onComplete()

	}

	fun method3(
		param0: com.android.example.module22_module01_module07_module1.ClassAAI,
		param1: com.android.example.module22_module01_module07_module1.ClassAAE,
		param2: com.android.example.module22_module01_module07_module1.ClassAAH,
		param3: com.android.example.module22_module01_module07_module1.ClassAAI
	) {
	}

	fun method4(
		param0: com.android.example.module22_module01_module07_module3.ClassAAJ,
		param1: com.android.example.module22_module01_module07_module1.ClassAAE,
		param2: com.android.example.module22_module01_module07_module3.ClassAAJ,
		param3: com.android.example.module22_module01_module07_module3.ClassAAA
	) {
		val local_var_2_4: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_4.hasSubscription()

		val local_var_2_5: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_5.onNext(kotlin.Any())

		val local_var_2_6: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_6.onComplete()

	}
}
