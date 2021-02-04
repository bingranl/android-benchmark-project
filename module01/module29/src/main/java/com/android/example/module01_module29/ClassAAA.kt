package com.android.example.module01_module29

@Suppress("UNUSED_PARAMETER")
class ClassAAA {
	private 	val instance_var_1_0: io.reactivex.internal.disposables.ListCompositeDisposable = io.reactivex.internal.disposables.ListCompositeDisposable()
	private 	val instance_var_1_1: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
	private 	val instance_var_1_2: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
	private 	val instance_var_1_3: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()

	fun method0(
		param0: io.reactivex.subscribers.TestSubscriber<kotlin.Any>,
		param1: io.reactivex.internal.disposables.ListCompositeDisposable,
		param2: io.reactivex.subscribers.TestSubscriber<kotlin.Any>
	) {
		val local_var_2_3: com.android.example.module15_module28_module1.ClassAAB = com.android.example.module15_module28_module1.ClassAAB()
		local_var_2_3.method2("SomeString")

		for (iAb in 0..3) {
			param0.isCancelled()

		}
		val local_var_2_4: com.android.example.module06_module254.ClassAAD = com.android.example.module06_module254.ClassAAD()
		local_var_2_4.method1(com.android.example.module06_module351_module1.ClassAAF(), com.android.example.module06_module340_module3.ClassAAF())

		val local_var_2_5: com.android.example.module15_module22_module1.ClassAAC = com.android.example.module15_module22_module1.ClassAAC()
		local_var_2_5.method0("SomeString")

	}

	fun method1(
		param0: io.reactivex.subscribers.TestSubscriber<kotlin.Any>,
		param1: io.reactivex.subscribers.TestSubscriber<kotlin.Any>,
		param2: io.reactivex.subscribers.TestSubscriber<kotlin.Any>,
		param3: io.reactivex.subscribers.TestSubscriber<kotlin.Any>
	) {
		val local_var_2_4: com.android.example.module15_module42_module1.ClassAAJ = com.android.example.module15_module42_module1.ClassAAJ()
		local_var_2_4.method1("SomeString", "SomeString")

	}

	fun method2(
		param0: io.reactivex.internal.util.LinkedArrayList,
		param1: io.reactivex.subscribers.TestSubscriber<kotlin.Any>,
		param2: io.reactivex.subscribers.TestSubscriber<kotlin.Any>,
		param3: io.reactivex.internal.schedulers.ComputationScheduler
	) {
	}

	fun method3(
		param0: io.reactivex.subscribers.TestSubscriber<kotlin.Any>
	) {
		val local_var_2_1: com.android.example.module15_module46_module1.ClassAAE = com.android.example.module15_module46_module1.ClassAAE()
		local_var_2_1.method1(com.android.example.module15_module21_module1.ClassAAA(), com.android.example.module15_module21_module1.ClassAAF(), com.android.example.module15_module21_module1.ClassAAA(), com.android.example.module15_module21_module1.ClassAAI())

	}
}
