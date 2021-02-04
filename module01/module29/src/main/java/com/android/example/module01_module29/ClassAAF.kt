package com.android.example.module01_module29

@Suppress("UNUSED_PARAMETER")
class ClassAAF {
	private 	val instance_var_1_0: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
	private 	val instance_var_1_1: io.reactivex.disposables.SerialDisposable = io.reactivex.disposables.SerialDisposable()
	private 	val instance_var_1_2: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
	private 	val instance_var_1_3: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()

	fun method0(
		param0: io.reactivex.subscribers.TestSubscriber<kotlin.Any>
	) {
		param0.dispose()

		val local_var_2_1: com.android.example.module15_module52_module1.ClassAAI = com.android.example.module15_module52_module1.ClassAAI()
		local_var_2_1.method3(com.android.example.module15_module20_module1.ClassAAA(), com.android.example.module15_module20_module1.ClassAAF(), com.android.example.module15_module20_module1.ClassAAE(), com.android.example.module15_module20_module1.ClassAAI())

		val local_var_2_2: com.android.example.module06_module314_module5.ClassAAG = com.android.example.module06_module314_module5.ClassAAG()
		local_var_2_2.method4(com.android.example.module06_module025_module2.ClassAAD(), com.android.example.module06_module025_module2.ClassAAH())

		val local_var_2_3: com.android.example.module15_module22_module1.ClassAAH = com.android.example.module15_module22_module1.ClassAAH()
		local_var_2_3.method1("SomeString", "SomeString")

	}

	fun method1(
		param0: io.reactivex.subscribers.TestSubscriber<kotlin.Any>,
		param1: io.reactivex.schedulers.TestScheduler,
		param2: io.reactivex.subscribers.TestSubscriber<kotlin.Any>,
		param3: io.reactivex.subscribers.TestSubscriber<kotlin.Any>
	) {
		param0.onNext(kotlin.Any())

		param0.onNext(kotlin.Any())

	}

	fun method2(
		param0: io.reactivex.subscribers.TestSubscriber<kotlin.Any>,
		param1: io.reactivex.internal.schedulers.NewThreadScheduler
	) {
		param0.assertSubscribed()

		param0.assertSubscribed()

		val local_var_2_2: com.android.example.module15_module59_module1.ClassAAJ = com.android.example.module15_module59_module1.ClassAAJ()
		local_var_2_2.method1(com.android.example.module15_module20_module1.ClassAAE(), com.android.example.module15_module20_module1.ClassAAD(), com.android.example.module15_module20_module1.ClassAAI())

	}

	fun method3(
		param0: io.reactivex.internal.disposables.ListCompositeDisposable,
		param1: io.reactivex.subscribers.TestSubscriber<kotlin.Any>
	) {
		param0.isDisposed()

	}
}
