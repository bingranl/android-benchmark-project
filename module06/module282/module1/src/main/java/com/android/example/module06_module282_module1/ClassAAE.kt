package com.android.example.module06_module282_module1

@Suppress("UNUSED_PARAMETER")
class ClassAAE {
	private 	val instance_var_1_0: com.android.example.module06_module342_module3.ClassAAE = com.android.example.module06_module342_module3.ClassAAE()
	private 	val instance_var_1_1: com.android.example.module06_module342_module3.ClassAAE = com.android.example.module06_module342_module3.ClassAAE()

	fun method0(
		param0: io.reactivex.subscribers.TestSubscriber<kotlin.Any>,
		param1: io.reactivex.subscribers.TestSubscriber<kotlin.Any>
	) {
		param0.onComplete()

		for (iAb in 0..1) {
			val local_var_3_0: io.reactivex.internal.schedulers.SingleScheduler = io.reactivex.internal.schedulers.SingleScheduler()
			local_var_3_0.shutdown()

		}
		val local_var_2_2: io.reactivex.internal.disposables.ListCompositeDisposable = io.reactivex.internal.disposables.ListCompositeDisposable()
		local_var_2_2.clear()

	}

	fun method1(
		param0: com.android.example.module06_module342_module3.ClassAAA,
		param1: io.reactivex.internal.disposables.ListCompositeDisposable
	) {
		val local_var_2_2: com.android.example.module06_module342_module3.ClassAAI = com.android.example.module06_module342_module3.ClassAAI()
		local_var_2_2.method3("SomeString")

		val local_var_2_3: com.android.example.module06_module342_module3.ClassAAJ = com.android.example.module06_module342_module3.ClassAAJ()
		local_var_2_3.method0("SomeString", "SomeString")

	}
}
