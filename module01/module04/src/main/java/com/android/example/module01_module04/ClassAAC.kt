package com.android.example.module01_module04

@Suppress("UNUSED_PARAMETER")
class ClassAAC {
	private 	val instance_var_1_0: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
	private 	val instance_var_1_1: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()

	fun method0(
		param0: io.reactivex.subscribers.TestSubscriber<kotlin.Any>,
		param1: io.reactivex.schedulers.TestScheduler,
		param2: io.reactivex.subscribers.TestSubscriber<kotlin.Any>,
		param3: io.reactivex.subscribers.TestSubscriber<kotlin.Any>
	) {
		for (iAb in 0..4) {
			for (iAc in 0..2) {
				listOf("1", "2", "3").forEach {
					param0.isDisposed()

				}
			}
		}
		val local_var_2_4: com.android.example.module06_module287_module3.ClassAAC = com.android.example.module06_module287_module3.ClassAAC()
		local_var_2_4.method1(com.android.example.module06_module090_module3.ClassAAG(), com.android.example.module06_module090_module3.ClassAAI())

	}

	fun method1(
		param0: io.reactivex.disposables.SerialDisposable,
		param1: io.reactivex.subscribers.TestSubscriber<kotlin.Any>
	) {
	}

	fun method2(
		param0: io.reactivex.subscribers.TestSubscriber<kotlin.Any>,
		param1: io.reactivex.internal.disposables.ListCompositeDisposable,
		param2: io.reactivex.subscribers.TestSubscriber<kotlin.Any>,
		param3: io.reactivex.schedulers.TestScheduler
	) {
	}

	fun method3(
		param0: io.reactivex.subscribers.TestSubscriber<kotlin.Any>
	) {
		val local_var_2_1: com.android.example.module06_module090_module3.ClassAAA = com.android.example.module06_module090_module3.ClassAAA()
		local_var_2_1.method1("SomeString", "SomeString", "SomeString")

		val local_var_2_2: com.android.example.module06_module090_module3.ClassAAH = com.android.example.module06_module090_module3.ClassAAH()
		local_var_2_2.method1("SomeString", "SomeString", "SomeString")

		param0.assertSubscribed()

	}
}
