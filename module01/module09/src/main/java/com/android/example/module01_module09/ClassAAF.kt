package com.android.example.module01_module09

@Suppress("UNUSED_PARAMETER")
class ClassAAF {
	private 	val instance_var_1_0: com.android.example.module06_module121_module3.ClassAAA = com.android.example.module06_module121_module3.ClassAAA()
	private 	val instance_var_1_1: com.android.example.module06_module121_module3.ClassAAG = com.android.example.module06_module121_module3.ClassAAG()
	private 	val instance_var_1_2: com.android.example.module06_module121_module3.ClassAAB = com.android.example.module06_module121_module3.ClassAAB()
	private 	val instance_var_1_3: com.android.example.module06_module121_module3.ClassAAD = com.android.example.module06_module121_module3.ClassAAD()
	private 	val instance_var_1_4: com.android.example.module06_module121_module3.ClassAAA = com.android.example.module06_module121_module3.ClassAAA()

	fun method0(
		param0: com.android.example.module06_module121_module3.ClassAAF,
		param1: com.android.example.module06_module121_module3.ClassAAJ
	) {
		val local_var_2_2: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_2.hasSubscription()

		for (iAb in 0..0) {
			val local_var_3_0: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
			local_var_3_0.isCancelled()

			local_var_3_0.cancel()

		}
		param0.method3(io.reactivex.subscribers.TestSubscriber())

	}

	fun method1(
		param0: com.android.example.module06_module121_module3.ClassAAD,
		param1: com.android.example.module06_module121_module3.ClassAAH,
		param2: com.android.example.module06_module121_module3.ClassAAC
	) {
		val local_var_2_3: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_3.assertNotSubscribed()

		val local_var_2_4: io.reactivex.internal.disposables.ListCompositeDisposable = io.reactivex.internal.disposables.ListCompositeDisposable()
		local_var_2_4.clear()

	}

	fun method2(
		param0: com.android.example.module06_module121_module3.ClassAAF
	) {
		param0.method2(io.reactivex.subscribers.TestSubscriber(), io.reactivex.subscribers.TestSubscriber(), io.reactivex.subscribers.TestSubscriber())

		val local_var_2_1: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_1.cancel()

	}

	fun method3(
		param0: com.android.example.module06_module121_module3.ClassAAA,
		param1: com.android.example.module06_module121_module3.ClassAAJ,
		param2: com.android.example.module06_module121_module3.ClassAAF,
		param3: com.android.example.module06_module121_module3.ClassAAA
	) {
		val local_var_2_4: io.reactivex.schedulers.TestScheduler = io.reactivex.schedulers.TestScheduler()
		local_var_2_4.createWorker()

		val local_var_2_5: io.reactivex.internal.schedulers.SingleScheduler = io.reactivex.internal.schedulers.SingleScheduler()
		local_var_2_5.createWorker()

	}

	fun method4(
		param0: com.android.example.module06_module121_module3.ClassAAD,
		param1: com.android.example.module06_module121_module3.ClassAAB
	) {
		param0.method1(io.reactivex.subscribers.TestSubscriber(), io.reactivex.internal.disposables.ListCompositeDisposable())

		val local_var_2_2: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_2.onNext(kotlin.Any())

		param0.method2(io.reactivex.subscribers.TestSubscriber(), io.reactivex.subscribers.TestSubscriber())

	}
}
