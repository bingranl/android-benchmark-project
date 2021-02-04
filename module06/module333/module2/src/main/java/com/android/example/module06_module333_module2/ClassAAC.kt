package com.android.example.module06_module333_module2

@Suppress("UNUSED_PARAMETER")
class ClassAAC {
	private 	val instance_var_1_0: com.android.example.module06_module333_module5.ClassAAF = com.android.example.module06_module333_module5.ClassAAF()
	private 	val instance_var_1_1: com.android.example.module06_module333_module5.ClassAAI = com.android.example.module06_module333_module5.ClassAAI()
	private 	val instance_var_1_2: com.android.example.module06_module333_module5.ClassAAD = com.android.example.module06_module333_module5.ClassAAD()

	fun method0(
		param0: com.android.example.module06_module333_module5.ClassAAF,
		param1: com.android.example.module06_module333_module5.ClassAAJ,
		param2: com.android.example.module06_module333_module5.ClassAAG,
		param3: com.android.example.module06_module333_module5.ClassAAE
	) {
		param0.method0(io.reactivex.internal.disposables.ListCompositeDisposable(), io.reactivex.subscribers.TestSubscriber(), io.reactivex.subscribers.TestSubscriber(), io.reactivex.subscribers.TestSubscriber())

		for (iAb in 0..6) {
			listOf("1", "2", "3").forEach {
				val local_var_4_0: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
				local_var_4_0.dispose()

				local_var_4_0.cancel()

			}
			val local_var_3_0: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
			local_var_3_0.onNext(kotlin.Any())

			val local_var_3_1: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
			local_var_3_1.assertNotSubscribed()

		}
	}

	fun method1(
		param0: com.android.example.module06_module333_module5.ClassAAJ,
		param1: com.android.example.module06_module333_module5.ClassAAI
	) {
		param0.method0(io.reactivex.internal.disposables.ListCompositeDisposable(), io.reactivex.internal.disposables.ListCompositeDisposable(), io.reactivex.subscribers.TestSubscriber())

		val local_var_2_2: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_2.onComplete()

	}

	fun method2(
		param0: com.android.example.module06_module333_module5.ClassAAH,
		param1: com.android.example.module06_module333_module5.ClassAAE,
		param2: com.android.example.module06_module333_module5.ClassAAH,
		param3: com.android.example.module06_module333_module5.ClassAAE
	) {
	}

	fun method3(
		param0: com.android.example.module06_module333_module5.ClassAAD,
		param1: com.android.example.module06_module333_module5.ClassAAB,
		param2: com.android.example.module06_module333_module5.ClassAAJ
	) {
		val local_var_2_3: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_3.isCancelled()

		param0.method1(io.reactivex.subscribers.TestSubscriber())

	}
}
