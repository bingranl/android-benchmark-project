package com.android.example.module07_module39_module2_module5

@Suppress("UNUSED_PARAMETER")
class ClassAAE {
	private 	val instance_var_1_0: io.reactivex.internal.disposables.ListCompositeDisposable = io.reactivex.internal.disposables.ListCompositeDisposable()
	private 	val instance_var_1_1: io.reactivex.internal.disposables.ListCompositeDisposable = io.reactivex.internal.disposables.ListCompositeDisposable()

	fun method0(
		param0: io.reactivex.subscribers.TestSubscriber<kotlin.Any>,
		param1: io.reactivex.internal.disposables.ListCompositeDisposable,
		param2: io.reactivex.subscribers.TestSubscriber<kotlin.Any>
	) {
		val local_var_2_3: com.android.example.module15_module39_module1.ClassAAI = com.android.example.module15_module39_module1.ClassAAI()
		local_var_2_3.method1(com.android.example.module15_module21_module1.ClassAAJ(), com.android.example.module15_module21_module1.ClassAAB(), com.android.example.module15_module21_module1.ClassAAI())

		param0.assertSubscribed()

		val local_var_2_4: com.android.example.module06_module173_module1.ClassAAJ = com.android.example.module06_module173_module1.ClassAAJ()
		local_var_2_4.method2(io.reactivex.subscribers.TestSubscriber(), io.reactivex.subscribers.TestSubscriber(), io.reactivex.subscribers.TestSubscriber(), io.reactivex.subscribers.TestSubscriber())

		val local_var_2_5: com.android.example.module15_module21_module1.ClassAAJ = com.android.example.module15_module21_module1.ClassAAJ()
		local_var_2_5.method0("SomeString", "SomeString")

	}

	fun method1(
		param0: io.reactivex.subscribers.TestSubscriber<kotlin.Any>,
		param1: io.reactivex.subscribers.TestSubscriber<kotlin.Any>,
		param2: io.reactivex.subscribers.TestSubscriber<kotlin.Any>
	) {
		val local_var_2_3: com.android.example.module06_module173_module1.ClassAAI = com.android.example.module06_module173_module1.ClassAAI()
		local_var_2_3.method2(io.reactivex.subscribers.TestSubscriber(), io.reactivex.subscribers.TestSubscriber())

	}

	fun method2(
		param0: io.reactivex.subscribers.TestSubscriber<kotlin.Any>,
		param1: io.reactivex.subscribers.TestSubscriber<kotlin.Any>,
		param2: io.reactivex.subscribers.TestSubscriber<kotlin.Any>
	) {
		val local_var_2_3: com.android.example.module06_module173_module1.ClassAAA = com.android.example.module06_module173_module1.ClassAAA()
		local_var_2_3.method1(io.reactivex.subscribers.TestSubscriber())

		param0.isCancelled()

		val local_var_2_4: com.android.example.module06_module173_module1.ClassAAE = com.android.example.module06_module173_module1.ClassAAE()
		local_var_2_4.method0(io.reactivex.subscribers.TestSubscriber(), io.reactivex.subscribers.TestSubscriber(), io.reactivex.internal.disposables.ListCompositeDisposable(), io.reactivex.subscribers.TestSubscriber())

	}

	fun method3(
		param0: io.reactivex.subscribers.TestSubscriber<kotlin.Any>,
		param1: io.reactivex.subscribers.TestSubscriber<kotlin.Any>,
		param2: io.reactivex.subscribers.TestSubscriber<kotlin.Any>,
		param3: io.reactivex.subscribers.TestSubscriber<kotlin.Any>
	) {
		val local_var_2_4: com.android.example.module06_module173_module1.ClassAAA = com.android.example.module06_module173_module1.ClassAAA()
		local_var_2_4.method1(io.reactivex.subscribers.TestSubscriber())

		val local_var_2_5: com.android.example.module15_module39_module1.ClassAAE = com.android.example.module15_module39_module1.ClassAAE()
		local_var_2_5.method1(com.android.example.module15_module21_module1.ClassAAB())

		val local_var_2_6: com.android.example.module06_module173_module1.ClassAAA = com.android.example.module06_module173_module1.ClassAAA()
		local_var_2_6.method2(io.reactivex.observers.TestObserver(), io.reactivex.internal.disposables.ListCompositeDisposable())

	}
}
