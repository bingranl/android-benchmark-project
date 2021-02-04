package com.android.example.module01_module09

@Suppress("UNUSED_PARAMETER")
class ClassAAH {
	private 	val instance_var_1_0: com.android.example.module06_module121_module3.ClassAAG = com.android.example.module06_module121_module3.ClassAAG()
	private 	val instance_var_1_1: com.android.example.module06_module121_module3.ClassAAJ = com.android.example.module06_module121_module3.ClassAAJ()

	fun method0(
		param0: com.android.example.module06_module121_module3.ClassAAB,
		param1: com.android.example.module06_module121_module3.ClassAAA,
		param2: com.android.example.module06_module121_module3.ClassAAC,
		param3: com.android.example.module06_module121_module3.ClassAAD
	) {
		val local_var_2_4: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_4.isDisposed()

		for (iAb in 0..5) {
			param0.method0(io.reactivex.internal.util.LinkedArrayList(41), io.reactivex.subscribers.TestSubscriber(), io.reactivex.subscribers.TestSubscriber())

			param0.method0(io.reactivex.internal.util.LinkedArrayList(51), io.reactivex.subscribers.TestSubscriber(), io.reactivex.subscribers.TestSubscriber())

		}
		val local_var_2_5: io.reactivex.internal.disposables.ListCompositeDisposable = io.reactivex.internal.disposables.ListCompositeDisposable()
		local_var_2_5.isDisposed()

	}

	fun method1(
		param0: com.android.example.module06_module121_module3.ClassAAC,
		param1: com.android.example.module06_module121_module3.ClassAAA,
		param2: com.android.example.module06_module121_module3.ClassAAA
	) {
	}

	fun method2(
		param0: com.android.example.module06_module121_module3.ClassAAA
	) {
		val local_var_2_1: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_1.onNext(kotlin.Any())

		param0.method0(io.reactivex.internal.disposables.ListCompositeDisposable(), io.reactivex.subscribers.TestSubscriber())

		val local_var_2_2: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_2.isDisposed()

	}

	fun method3(
		param0: com.android.example.module06_module121_module3.ClassAAA,
		param1: com.android.example.module06_module121_module3.ClassAAH,
		param2: com.android.example.module06_module121_module3.ClassAAD
	) {
		val local_var_2_3: io.reactivex.internal.schedulers.SingleScheduler = io.reactivex.internal.schedulers.SingleScheduler()
		local_var_2_3.createWorker()

	}

	fun method4(
		param0: com.android.example.module06_module121_module3.ClassAAI,
		param1: com.android.example.module06_module121_module3.ClassAAA,
		param2: com.android.example.module06_module121_module3.ClassAAI
	) {
		param0.method1(io.reactivex.internal.disposables.ListCompositeDisposable(), io.reactivex.subscribers.TestSubscriber())

		param0.method0(io.reactivex.subscribers.TestSubscriber(), io.reactivex.subscribers.TestSubscriber(), io.reactivex.subscribers.TestSubscriber())

	}
}
