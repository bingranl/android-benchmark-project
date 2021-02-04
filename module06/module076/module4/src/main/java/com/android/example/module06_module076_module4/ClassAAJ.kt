package com.android.example.module06_module076_module4

@Suppress("UNUSED_PARAMETER")
class ClassAAJ {
	private 	val instance_var_1_0: com.android.example.module06_module076_module1.ClassAAE = com.android.example.module06_module076_module1.ClassAAE()
	private 	val instance_var_1_1: com.android.example.module06_module076_module1.ClassAAI = com.android.example.module06_module076_module1.ClassAAI()
	private 	val instance_var_1_2: com.android.example.module06_module076_module1.ClassAAB = com.android.example.module06_module076_module1.ClassAAB()

	fun method0(
		param0: com.android.example.module06_module076_module5.ClassAAI,
		param1: com.android.example.module06_module076_module5.ClassAAC
	) {
	}

	fun method1(
		param0: com.android.example.module06_module076_module5.ClassAAI,
		param1: com.android.example.module06_module076_module5.ClassAAF
	) {
	}

	fun method2(
		param0: com.android.example.module06_module076_module5.ClassAAC,
		param1: com.android.example.module06_module076_module5.ClassAAG
	) {
		val local_var_2_2: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_2.isDisposed()

		for (iAb in 0..6) {
			for (iAc in 0..2) {
				param0.method4("SomeString", "SomeString", "SomeString", "SomeString")

			}
			val local_var_3_0: io.reactivex.internal.schedulers.SingleScheduler = io.reactivex.internal.schedulers.SingleScheduler()
			local_var_3_0.shutdown()

		}
		val local_var_2_3: io.reactivex.internal.disposables.ListCompositeDisposable = io.reactivex.internal.disposables.ListCompositeDisposable()
		local_var_2_3.clear()

	}

	fun method3(
		param0: com.android.example.module06_module076_module5.ClassAAI,
		param1: com.android.example.module06_module076_module1.ClassAAJ,
		param2: com.android.example.module06_module076_module1.ClassAAJ,
		param3: com.android.example.module06_module076_module5.ClassAAA
	) {
		param0.method2("SomeString", "SomeString")

		val local_var_2_4: io.reactivex.schedulers.TestScheduler = io.reactivex.schedulers.TestScheduler()
		local_var_2_4.createWorker()

		val local_var_2_5: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_5.assertSubscribed()

		val local_var_2_6: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_6.onNext(kotlin.Any())

	}
}
