package com.android.example.module06_module083_module06

@Suppress("UNUSED_PARAMETER")
class ClassAAI {
	private 	val instance_var_1_0: com.android.example.module06_module109_module1.ClassAAA = com.android.example.module06_module109_module1.ClassAAA()
	private 	val instance_var_1_1: com.android.example.module06_module083_module09.ClassAAH = com.android.example.module06_module083_module09.ClassAAH()
	private 	val instance_var_1_2: com.android.example.module06_module321_module10.ClassAAH = com.android.example.module06_module321_module10.ClassAAH()

	fun method0(
		param0: com.android.example.module06_module109_module1.ClassAAD,
		param1: com.android.example.module06_module109_module1.ClassAAD,
		param2: com.android.example.module06_module109_module1.ClassAAG
	) {
		val local_var_2_3: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_3.assertNotSubscribed()

		val local_var_2_4: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_4.requestMore(-6956942557213488132)

		for (iAb in 0..2) {
			val local_var_3_0: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
			local_var_3_0.onError(kotlin.Throwable())

			local_var_3_0.isDisposed()

			val local_var_3_1: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
			local_var_3_1.request(-6873761404203516042)

			val local_var_3_2: io.reactivex.observers.TestObserver<kotlin.Any> = io.reactivex.observers.TestObserver()
			local_var_3_2.onError(kotlin.Throwable())

		}
		val local_var_2_5: io.reactivex.internal.disposables.ListCompositeDisposable = io.reactivex.internal.disposables.ListCompositeDisposable()
		local_var_2_5.dispose()

	}

	fun method1(
		param0: com.android.example.module06_module109_module1.ClassAAD,
		param1: com.android.example.module06_module109_module1.ClassAAB,
		param2: com.android.example.module06_module321_module10.ClassAAD,
		param3: com.android.example.module06_module083_module09.ClassAAH
	) {
	}

	fun method2(
		param0: com.android.example.module06_module321_module10.ClassAAA
	) {
		val local_var_2_1: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_1.hasSubscription()

		val local_var_2_2: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_2.onError(kotlin.Throwable())

		val local_var_2_3: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_3.onNext(kotlin.Any())

	}

	fun method3(
		param0: com.android.example.module06_module321_module10.ClassAAD,
		param1: com.android.example.module06_module083_module09.ClassAAI,
		param2: com.android.example.module06_module321_module10.ClassAAE
	) {
		val local_var_2_3: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_3.isDisposed()

	}

	fun method4(
		param0: com.android.example.module06_module321_module10.ClassAAF,
		param1: com.android.example.module06_module083_module09.ClassAAJ,
		param2: com.android.example.module06_module109_module1.ClassAAF,
		param3: com.android.example.module06_module321_module10.ClassAAG
	) {
		val local_var_2_4: io.reactivex.internal.disposables.ListCompositeDisposable = io.reactivex.internal.disposables.ListCompositeDisposable()
		local_var_2_4.dispose()

	}
}
